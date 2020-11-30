package arcmop.blog.springbootest.configuracion.controladores;

import java.util.Collections;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import arcmop.blog.springbootest.configuracion.model.Suma;
import arcmop.blog.springbootest.configuracion.service.SumaService;

@RestController
@RequestMapping
public class ControladorHolaMundo {

	@Autowired
	private SumaService sumaServ;

	private Suma suma;

	@RequestMapping(value = "/sumar/{sum01}/{sum02}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Map saludar(@PathVariable("sum01") Integer sum01, @PathVariable("sum02") Integer sum02) {
		Integer result = saveSuma(sum01, sum02);
		return Collections.singletonMap("resultado", String.valueOf(result));
	}

	public Integer saveSuma(Integer sum01, Integer sum02) {
		Integer resultado = sum01 + sum02;
		suma = new Suma();
		suma.setSum01(sum01);
		suma.setSum02(sum02);
		suma.setResultado(resultado);
		sumaServ.save(suma);
		return resultado;
	}

}
