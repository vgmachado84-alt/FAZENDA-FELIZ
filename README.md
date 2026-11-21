# Fazenda Feliz — primeira versão jogável

Protótipo Android usando WebView, com visual isométrico 2.5D e jogo funcional:
- plantar e colher trigo, milho, cenoura e morango;
- crescimento com tempo real;
- moedas, experiência, níveis e venda;
- loja de sementes, expansão de canteiros;
- salvamento automático no aparelho.

## Como usar no projeto Android
1. Copie `app/src/main/assets/index.html` para a mesma pasta no seu projeto.
2. Copie `MainActivity.kt` para o pacote correspondente (ou ajuste a linha `package`).
3. Confira se o `AndroidManifest.xml` aponta para `.MainActivity`.
4. Execute no Android Studio e teste no celular.

Esta primeira entrega é um protótipo 2.5D leve, sem servidor e sem multiplayer. A etapa seguinte pode trocar a cena por gráficos 3D reais e adicionar animais interativos, missões e visitas a outras fazendas.
