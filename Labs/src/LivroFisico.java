
class LivroFisico extends ItemMultimidia {
	private String ISBN;
	private String edicao;
	private int numTotalDeCopias;
	private int numTotalDeCopiasPorEdicao;
	private String LocalizacaoNaBiblioteca;
	private static String[] EstadoDeConservacao = new String[]{"Novo", "Antigo em boas condicoes", "Antigo em mas condicoes"};
    private int numeroPaginas;

    public LivroFisico(String titulo, String autor, String codigo, int numeroPaginas) {
        super(titulo, codigo);
        this.numeroPaginas = numeroPaginas;
    }
}