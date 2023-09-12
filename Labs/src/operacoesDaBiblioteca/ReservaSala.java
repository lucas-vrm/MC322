package operacoesDaBiblioteca;

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
	public LocalDate getDataReserva() {
		return dataReserva;
	}
	public void setDataReserva(LocalDate dataReserva) {
		this.dataReserva = dataReserva;
		}
	public LocalTime getHoraInicio() {
		return horaInicio;
	}
	public void setHoraInicio(LocalTime horaInicio) {
		this.horaInicio = horaInicio;
	}
	public LocalTime getHoraFim() {
		return horaFim;
	}
	public void setHoraFim(LocalTime horaFim) {
		this.horaInicio = horaFim;
	}
	public StatusReserva getStatusReserva() {
		return status;
	}
	public void setStatusReserva(StatusReserva status) {
		this.status = status;
	}
	
	
	public class SalaIndividual {
        private boolean computadorDisponivel;
        private int numeroSala;

        public SalaIndividual(boolean computadorDisponivel, int numeroSala) {
            this.computadorDisponivel = computadorDisponivel;
            this.numeroSala = numeroSala;
        }
        public boolean getComputadorDisponivel() {
        	return computadorDisponivel;
        }
        public void setComputadorDisponivel(boolean computadorDisponivel) {
        	this.computadorDisponivel = computadorDisponivel;
        }
        public int getNumeroSala() {
        	return numeroSala;
        }
        public void setNumeroSala(int numeroSala) {
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
        public int getCapacidadeMaxima() {
        	return capacidadeMaxima;
        }
        public void setCapacidadeMaxima(int capacidadeMaxima) {
        	this.capacidadeMaxima = capacidadeMaxima;
        }
        public boolean getEquipamentoApresentacao() {
        	return equipamentoApresentacao;
        }
        public void setEquipamentoApresentacao(boolean equipamentoApresentacao) {
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
        public int getNumeroAssentos() {
        	return numeroAssentos;
        }
        public void setNumemroAssentos(int numeroAssentos) {
        	this.numeroAssentos = numeroAssentos;
        }
        public boolean getCabinesInvidivuais() {
        	return cabinesIndividuais;
        }
        public void setCabinesIndividuais(boolean cabinesIndividuais) {
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
        public boolean getEquipamentoAudio() {
        	return equipamentoAudio;
        }
        public void setEquipamentoAudio(boolean equipamentoAudio) {
        	this.equipamentoAudio = equipamentoAudio;
        }
        public boolean getEquipamentoVideo() {
        	return equipamentoVideo;
        }
        public void setEquipamentoVideo(boolean equipamentoVideo) {
        	this.equipamentoVideo = equipamentoVideo;
        }
    }
}