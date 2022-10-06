<template>
  <!-- <link href="../assets/css/main.css" rel="stylesheet"> -->
  <div class="fundo">
  <div class="fundo-salvos">
  <div class="container">
    <b-container>
      <Nuxt-Link to="/conteudos"
        ><img class="cancel" src="~/assets/cancel.png" alt="cancel icon"
      /></Nuxt-Link>
      <div>
        <img class="img-salvos-1" src="~/assets/Image2.png" />
        <b-button class="botao">#Saúde</b-button>
        <img class="icon-2" src="~/assets/Icon.png" alt="Icon salvar" />
        <img
          class="icon-3"
          src="~/assets/likeecomp.png"
          alt="Icon compartilhar"
        />
      </div>

      <div class="layout-2">
        <p class="conteudo-4">2 meses atrás</p>
        <h4 class="titulo-1-conteudo">Prática do exercício físico</h4>

        <p class="conteudo-3">Dicas para quem quer melhorar a rotina de</p>
        <p class="conteudo-3">exercícios físicos durante as férias.</p>
        <div class="conteudo-5">
          <p>• Diminua o ritmo dos exercícios, mas não pare totalmente.</p>
          <p>• Inclua exercícios nos passeios turísticos.</p>
          <p>• Envola a família nos passeios.</p>
          <p>• Cuide de sua alimentação.</p>
        </div>
      </div>

      <div class="caixa-baixo">
        <div class="footer">
          <img class="metas" src="~/assets/emoji_events.png" alt="trofeu" />

          <NuxtLink to="/tarefas-1"
            ><img class="dns" src="~/assets/dns.png" alt="dns"
          /></NuxtLink>

          <NuxtLink to="/conteudos"
            ><img class="conteudos" src="~/assets/search.png" alt="lupa"
          /></NuxtLink>
        </div>

        <div class="footer-2">
          <p class="texto-metas">Metas</p>
          <p class="texto-dns">Tarefas</p>
          <p class="texto-conteudos">Conteúdos</p>
        </div>
      </div>
    </b-container>
  </div>
  </div>
  </div>
</template>

<script>
export default {
  async asyncData({ route }) {
    const { id } = await route.params
    return { id }
  },

  data() {
    return {
      titulo: 'Conteudos',
      conteudo: [],
      salvos: [
        {
          id: 1,
          url: '~/assets/Image2.png',
          tempo: '2 meses atrás',
          titulo: 'Prática do exercício físico',
          titulo2:
            'Dicas para quem quer melhorar a rotina de exercícios físicos durante as férias.',
          conteudoS: [
            '• Diminua o ritmo dos exercícios, mas não pare totalmente.',
            '• Inclua exercícios nos passeios turísticos.',
            '• Envola a família nos passeios.',
            '• Cuide de sua alimentação.',
          ],
        },
      ],
    }
  },
}
</script>

