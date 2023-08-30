class LivroEletronico extends ItemMultimidia {
    private static String[] formatos = new String[] {"PDF", "ePub", "Mobi","IBA", "outro"};
    private String formato;
    private int NumTotalDeLicencas;
    private String URLDeAcesso;
    private String dataDeDisponibilidade;

    public LivroEletronico(String titulo, String autor, String codigo, String formato) {
        super(titulo, codigo);
        this.formato = formato;
    }
}
