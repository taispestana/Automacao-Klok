#language: pt
# encoding: utf-8

Funcionalidade: Busca de produto no site de e-commerce

  Contexto:
    Dado que o usuário está na página inicial do site de e-commerce

  Delineação do Cenário: Busca por um produto
    Quando o usuário digita "<nomeProduto>" na barra de busca
    E clica no ícone de pesquisa
    Então a página de resultados de pesquisa é exibida
    E os resultados incluem pelo menos um produto "<nomeProduto>"

    Exemplos:
      | nomeProduto                    |
      | Maionese Tradicional Hellmanns |
      | PlayStation 5                  |

  Delineação do Cenário: Busca um produto com erro no nome
    Quando o usuário digita "<nomeProdutoIncorreto>" na barra de busca
    E clica no ícone de pesquisa
    Então a página de resultados de pesquisa é exibida
    E os resultados incluem pelo menos um produto "<nomeProdutoCorreto>"

    Exemplos:
      | nomeProdutoIncorreto | nomeProdutoCorreto |
      | Geladeiro            | Geladeira          |
      | Plaitation 5         | PlayStation 5      |

  Delineação do Cenário: Busca por um produto que não existe
    Quando o usuário digita "<nomeProduto>" na barra de busca
    E clica no ícone de pesquisa
    Então a página de resultados de pesquisa não encontrado é exibida

    Exemplos:
      | nomeProduto |
      | teste123    |
      | teste789    |