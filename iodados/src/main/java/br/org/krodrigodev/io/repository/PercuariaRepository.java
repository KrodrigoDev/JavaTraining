package br.org.krodrigodev.io.repository;

import br.org.krodrigodev.io.domain.Percuaria;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import javax.swing.JOptionPane;
import java.util.List;

public class PercuariaRepository {

    public void salvar(List<Percuaria> percuarias) {

        try (EntityManagerFactory fabricaPesistencia =
                     Persistence.createEntityManagerFactory("sinc")) {

            EntityManager gerenciadorEntidade = fabricaPesistencia.createEntityManager();
            EntityTransaction transacaoEntidade = gerenciadorEntidade.getTransaction();

            try {
                transacaoEntidade.begin();

                for (Percuaria percuaria : percuarias) {
                    gerenciadorEntidade.merge(percuaria);
                }

                transacaoEntidade.commit();

                JOptionPane.showMessageDialog(null,
                        "Foi feita a inserção de " + percuarias.size() + " itens com sucesso!");

            } catch (Exception erro) {
                transacaoEntidade.rollback();
                JOptionPane.showMessageDialog(null,
                        "Ocorreu um erro ao inserir no banco de dados: " + erro.getMessage());
            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null,
                    "Ocorreu um erro ao criar o EntityManager: " + erro.getMessage());
        }
    }

}
