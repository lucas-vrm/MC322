import java.time.LocalDate;
import java.time.LocalTime;

public class ReservaSala {
	private LocalDate dataReserva;
    private LocalTime horaInicio;
    private LocalTime horaFim;
    private StatusReserva status;
	
	public enum StatusReserva {
		PENDENTE,
		CONFIRMADA,
		CANCELADA
	}
	
	public ReservaSala(LocalDate dataReserva, LocalTime horaInicio, LocalTime horaFim) {
        this.dataReserva = dataReserva;
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
        this.status = StatusReserva.PENDENTE; 
    }
	
	public class SalaIndividual {
        private boolean computadorDisponivel;
        private int numeroSala;

        public SalaIndividual(boolean computadorDisponivel, int numeroSala) {
            this.computadorDisponivel = computadorDisponivel;
            this.numeroSala = numeroSala;
        }
    }

    public class SalaGrupo {
        private int capacidadeMaxima;
        private boolean equipamentoApresentacao;

        public SalaGrupo(int capacidadeMaxima, boolean equipamentoApresentacao) {
            this.capacidadeMaxima = capacidadeMaxima;
            this.equipamentoApresentacao = equipamentoApresentacao;
        }
    }

    public class SalaSilenciosa {
        private int numeroAssentos;
        private boolean cabinesIndividuais;

        public SalaSilenciosa(int numeroAssentos, boolean cabinesIndividuais) {
            this.numeroAssentos = numeroAssentos;
            this.cabinesIndividuais = cabinesIndividuais;
        }
    }

    public class SalaMultimidia {
        private boolean equipamentoAudio;
        private boolean equipamentoVideo;

        public SalaMultimidia(boolean equipamentoAudio, boolean equipamentoVideo) {
            this.equipamentoAudio = equipamentoAudio;
            this.equipamentoVideo = equipamentoVideo;
        }
    }
}
