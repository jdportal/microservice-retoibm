package arcmop.blog.springbootest.configuracion.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Suma {
	@Id
	@GeneratedValue
	private Integer id;
	private Integer sum01;
	private Integer sum02;
	private Integer resultado;

	public Integer getSum01() {
		return sum01;
	}

	public void setSum01(Integer sum01) {
		this.sum01 = sum01;
	}

	public Integer getSum02() {
		return sum02;
	}

	public void setSum02(Integer sum02) {
		this.sum02 = sum02;
	}

	public Integer getResultado() {
		return resultado;
	}

	public void setResultado(Integer resultado) {
		this.resultado = resultado;
	}

}
