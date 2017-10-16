
# PROJETO FÁBRICA DE CARROS

Projeto Criado para uma Fábrica de Carros,onde no mesmo foi Utilizado 4 Design patterns.São eles:
<p><strong>*Factory</strong> </p>
<p><strong>*Decorator</strong> </p>
<p><strong>*Composite</strong> </p>
<p><strong>*Buider</strong> </p>


## Utilização dos Patterns no Projeto

<strong>Factory</strong>: Foi ultilizada para definir uma interface para criar um objeto, deixando as subclasses decidirem que classe instanciar.Fazendo com que o mesmo possa adiar a instanciação para subclasses.

-Ou seja, ao invés de criar objetos diretamente em uma classe concreta,onde eu defini uma interface de criação de objetos e cada subclasse fica responsável por criar seus objetos. Seria como se, ao invés de ter uma fábrica de carros, nós tivéssemos uma fábrica da Fiat, que cria o carro da Fiat, uma fábrica da Ford, que cria o carro da Ford e etc.
=======================================================================================================================================

-DECORATOR: Utilizei esse padrão para Dinamicamente, agregar responsabilidades adicionais aos objetos o qual eu criei. Assim fornecendo uma alternativa flexível ao uso de subclasses para extensão de funcionalidades.

*Portando, dado um objeto Veículo, seja possível adicionar funcionalidades a ele como por exemplo adicionar ar-condicionado,direção Hidráulica etc, e somente a ele, em tempo de execução.
=======================================================================================================================================

-COMPOSITE: Utilizei esse padrão para compor objetos em estruturas de árvore para representar hierarquia partes-todo. permitindo assim  aos clientes tratarem de maneira uniforme objetos individuais e composições dos objetos criados.

*Considerando que um objeto carro pode ser elemento de um objeto garagem,considerando assim que garagem é uma lista de carro.
dentro da garagem existe um atibuto e uma lista de carro,onde cada carro à tambem possui seus atibutos, essa lista de carro funciona como atributo de garagem. Facilitando o tratamento dos objetos para poder conseguir guardar os carros dentro dessa garaem.
========================================================================================================================================
-BUILDER: Utilizei esse padrão para poder separar a construção de um objeto complexo de sua representação de modo que o mesmo processo de construção possa criar diferentes representações.Como também permitir separar os passos de construção de um objeto em pequenos métodos.

*Criei uma interface comum para todos os objetos que constroem outros objetos.Minha interface Builder irá definir todos os passos necessários para construir um objeto.Nada mais é do que uma estrutura de dado que armazena as informações de um carro.Dado um Builder, a classe vai executar os métodos de construção, definindo assim o algoritmo de construção do carro, e depois devolve o carro. O código cliente vai lidar apenas com o Director, toda a estrutura e algoritmos utilizados para construir o carro ficarão por debaixo dos panos.
