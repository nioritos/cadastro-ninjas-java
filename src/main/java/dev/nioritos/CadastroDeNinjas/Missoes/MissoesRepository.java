package dev.nioritos.CadastroDeNinjas.Missoes;

import org.springframework.data.jpa.repository.JpaRepository;
// JPA é uma interface com as funcionalidades abstraidas/facilitadas do banco de dados
// Extendendo o JPA e dizendo q é referente a class missoes model e vai traduzir tudo escrito para a linguagem do banco de dados, passando q o tipo do id é long
// Sendo ORM, ele vai ficar sempre mapeando nossa classe para fazer essa traducao
public interface MissoesRepository extends JpaRepository<MissoesModel, Long> {

}
