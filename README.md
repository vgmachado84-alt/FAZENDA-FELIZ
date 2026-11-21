# Fazenda Feliz — Android

Primeira versão jogável do **Fazenda Feliz**, feita para Android com Kotlin + WebView.

## Recursos
- 8 sementes (nabo, cenoura, milho, tomate, abóbora, morango, melancia e girassol), liberadas por nível; algumas dão duas safras.
- Plantas crescem em tempo real em cinco etapas, mesmo com o app fechado.
- Mato, bichinhos e terra seca para cuidar: quem cuida colhe mais.
- Celeiro para vender a colheita.
- Pedidos de clientes entregues pelo caminhão, pagando mais que o celeiro.
- Loja: adubo, espantalho, motor turbo e irrigação automática.
- Níveis, novos canteiros (até 16), presente diário e salvamento automático.

## Estrutura
- `app/src/main/java/com/fazendafeliz/MainActivity.kt`: atividade Android.
- `app/src/main/assets/index.html`: interface e lógica do jogo.
- `app/src/main/AndroidManifest.xml`: configuração do aplicativo.
- `app/src/main/res/`: ícone do app.
- `gradle/wrapper/gradle-wrapper.properties`: versão do Gradle (8.9).

## Baixar o APK pelo celular
A cada envio para o repositório, o GitHub gera o APK sozinho (aba **Actions**). Quando terminar, ele aparece em **Releases**, no arquivo `FazendaFeliz.apk`, pronto para baixar e instalar.

## Abrir e gerar APK no computador
1. Abra a pasta `Fazenda_Feliz_Android` no Android Studio.
2. Aguarde a sincronização do Gradle. Se o Android Studio perguntar sobre o Gradle wrapper, aceite usar o `gradle-wrapper.properties`.
3. Conecte um celular Android com depuração USB ou use um emulador.
4. Clique em **Run** para testar.
5. Para gerar APK: **Build > Build Bundle(s) / APK(s) > Build APK(s)**.

## Identificação
- Nome: Fazenda Feliz
- Pacote: `com.fazendafeliz`
- Plataforma: Android
- `minSdk`: 23
- `targetSdk`: 35

## Observação
Esta é uma primeira versão 2.5D leve, sem servidor e sem multiplayer. A cena ainda não é 3D real. Próximas etapas podem adicionar modelos 3D, animais interativos, missões e visitas a outras fazendas.
