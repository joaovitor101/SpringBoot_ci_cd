package br.com.fatec.api_filosofia.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(FilosofiaController.class)
class FilosofiaControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void deveRetornarFraseCorreta() throws Exception {
        mockMvc.perform(get("/api/frases"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0]").value("Tudo sei, mas não sei que eu sei"))
                .andExpect(jsonPath("$[1]").value("Penso, logo existo"))
                .andExpect(jsonPath("$[2]").value("A vida é bela"));
    }

    @Test
    void deveRetornarFilosofoCorreto() throws Exception {
        mockMvc.perform(get("/api/filosofos"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0]").value("Leonardo da Vinci"))
                .andExpect(jsonPath("$[1]").value("Sócrates"))
                .andExpect(jsonPath("$[2]").value("Platão"))
                .andExpect(jsonPath("$[3]").value("Aristóteles"));
    }

    @Test
    void deveRetornarLivroCorreto() throws Exception {
        mockMvc.perform(get("/api/livros"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0]").value("The complete paintings in detail"))
                .andExpect(jsonPath("$[1]").value("A República"))
                .andExpect(jsonPath("$[2]").value("Ética a Nicômaco"));
    }
}