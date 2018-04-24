# Checkbox

Criação do código do Checkbox. Inclui várias refatorações interessantes, tais como:

1. Criação da interface Component, que contém a interface de todos os componentes de tela. Essa interface será importante para a implementação de vários padrões de projeto que ainda veremos, tais como: Proxy, Decorator ou Composite
1. Criação da classe AbstractComponent que agrega a lógica comum entre o Checkbox e o Button.
1. A classe App agora coloca os componentes em uma lista, facilitando a adição de listeners e sua pintura. A cópia do contexto gráfico agora é feita na classe da aplicação.
1. Criação dos métodos getX2() e getY2() na classe AbstractComponent, evitando o mau cheiro de fórmulas mágicas no meio do código
1. Criação do pacote gui, com todos os componentes dentro, para evitar que seus atributos ou métodos private sejam visíveis na classe App
