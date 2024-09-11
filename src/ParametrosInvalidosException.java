class ParametrosInvalidosException extends Exception {
  private static final long serialVersionUID = 1L;

  public ParametrosInvalidosException() {
      super("Parâmetros inválidos: o primeiro parâmetro deve ser menor que o segundo.");
  }
}