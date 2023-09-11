package exceptions.sem2.ex02;

class SubtractionException extends Exception {
    private String operation;
    private int operand1;
    private int operand2;
    private String errorMessage;

    public SubtractionException(String operation, int operand1, int operand2, String errorMessage) {
        this.operation = operation;
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.errorMessage = errorMessage;
    }

    @Override
    public String getMessage() {
        return "Error during " + operation + " operation: "
                + "Operand 1: " + operand1 + ", Operand 2: " + operand2
                + " - " + errorMessage;
    }
}