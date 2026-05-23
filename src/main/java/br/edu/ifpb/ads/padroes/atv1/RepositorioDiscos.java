public class RepositorioDiscos {

    private List<Disco> discos = new LinkedList<>();
    private List<Interessado> interessados = new LinkedList<>();


    public void addDisco(Disco disco) {
        discos.add(disco);
        notificarInteressados(disco);
    }

    public void registrarInteressado(Interessado interessado) {
        interessados.add(interessado);
    }

    public void removerInteressado(Interessado interessado) {
        interessados.remove(interessado);
    }

    private void notificarInteressados(Disco disco) {
        for (Interessado interessado : interessados) {
            interessado.atualizar(disco);
        }
    }
}