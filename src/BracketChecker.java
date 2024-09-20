class BracketChecker {
    private String input;

    public boolean check() {
        LinkStack stack = new LinkStack();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch == '{' || ch == '[' || ch == '(') {
                stack.push(ch);
            } else if (ch == '}' || ch == ']' || ch == ')') {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    char top = stack.pop();
                    if ((ch == '}' && top != '{') ||
                            (ch == ']' && top != '[') ||
                            (ch == ')' && top != '(')) {
                        return false;
                    }
                }
            }
        }

        return stack.isEmpty();
    }
    public BracketChecker(String input) {
        this.input = input;
    }}

