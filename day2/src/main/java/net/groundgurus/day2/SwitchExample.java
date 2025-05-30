void main() {
    var position = "Mid-Level Programmer";

    // primitive types (byte, short, int, long, float, double, char), String type, Enumeration
    var result = switch (position) {
        case "Programmer" -> "Teach me master";
        case "Mid-Level Programmer" -> "Learning is the key to success";
        case "Senior Programmer" -> "Let me show you how to do it";
        default -> "HTML is a programming language";
    };

    System.out.println(result);
    System.out.println("Done");
}