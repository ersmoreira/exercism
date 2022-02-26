public class SalaryCalculator {

  private static final double regularSalaryMultiplier = 1;
  private static final int daysSkippedAllowance = 5;
  private static final double daysSkippedSalaryMultiplier = 0.85;
  private static final int regularBonusMultiplier = 10;
  private static final int significantNumProducts = 20;
  private static final int significantNumProductsBonusMultiplier = 13;
  private static final double baseSalary = 1000.0;
  private static final double maxTotalSalary = 2000.0;

  public double multiplierPerDaysSkipped(int daysSkipped) {
    return daysSkipped > daysSkippedAllowance
      ? daysSkippedSalaryMultiplier
      : regularSalaryMultiplier;
  }

  public int multiplierPerProductsSold(int productsSold) {
    return productsSold > significantNumProducts
      ? significantNumProductsBonusMultiplier
      : regularBonusMultiplier;
  }

  public double bonusForProductSold(int productsSold) {
    return this.multiplierPerProductsSold(productsSold) * productsSold;
  }

  public double finalSalary(int daysSkipped, int productsSold) {
    double salary =
      1000.0 *
      this.multiplierPerDaysSkipped(daysSkipped) +
      this.bonusForProductSold(productsSold);
    return Math.min(salary, maxTotalSalary);
  }
}
