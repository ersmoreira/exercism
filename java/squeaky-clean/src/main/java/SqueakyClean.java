class SqueakyClean {

  static String clean(String identifier) {
    var stringBuilder = new StringBuilder();
    var isAfterDash = false;
    for (var c : identifier.toCharArray()) {
      if (c >= 'α' && c <= 'ω') {
        continue;
      } else if (isAfterDash) {
        stringBuilder.append(Character.toUpperCase(c));
      } else if (Character.isWhitespace(c)) {
        stringBuilder.append('_');
      } else if (Character.isISOControl(c)) {
        stringBuilder.append("CTRL");
      } else if (Character.isLetter(c)) {
        stringBuilder.append(c);
      }
      isAfterDash = (c == '-');
    }
    return stringBuilder.toString();
  }
}
