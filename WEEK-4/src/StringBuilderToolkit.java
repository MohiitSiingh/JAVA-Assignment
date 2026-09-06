public class StringBuilderToolkit {

    public static String reverse(String text) {
        if (text == null) {
            return null;
        }

        StringBuilder builder = new StringBuilder(text);
        builder.reverse();

        return builder.toString();
    }

    public static String repeat(String text, int count) {
        if (text == null) {
            return null;
        }

        if (count < 0) {
            return null;
        }

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < count; i++) {
            builder.append(text);
        }

        return builder.toString();
    }

    public static String joinWords(String[] words, String separator) {
        if (words == null || separator == null) {
            return null;
        }

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            if (i > 0) {
                builder.append(separator);
            }

            builder.append(words[i]);
        }

        return builder.toString();
    }

    public static String removeCharacterAt(String text, int index) {
        if (text == null || index < 0 || index >= text.length()) {
            return null;
        }

        StringBuilder builder = new StringBuilder(text);
        builder.deleteCharAt(index);

        return builder.toString();
    }

    public static String replaceCharacterAt(
            String text, int index, char replacement) {

        if (text == null || index < 0 || index >= text.length()) {
            return null;
        }

        StringBuilder builder = new StringBuilder(text);
        builder.setCharAt(index, replacement);

        return builder.toString();
    }

    public static String buildNumberedList(String[] items) {
        if (items == null) {
            return null;
        }

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < items.length; i++) {
            builder.append(i + 1);
            builder.append(". ");
            builder.append(items[i]);

            if (i < items.length - 1) {
                builder.append("\n");
            }
        }

   
        builder.insert(0, "");

        return builder.toString();
    }
}