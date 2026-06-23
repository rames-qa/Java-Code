package Interview;

public class ValidParentheses {
public static boolean isValid(String s) {
	if (s == null || s.length() % 2 != 0) {
		return false;
	}

	java.util.Stack<Character> stack = new java.util.Stack<>();

	for (char c : s.toCharArray()) {
		if (c == '(') {
			stack.push(')');
		} else if (c == '{') {
			stack.push('}');
		} else if (c == '[') {
			stack.push(']');
		} else if (stack.isEmpty() || stack.pop() != c) {
			return false;
		}
	}

	return stack.isEmpty();
}
}
