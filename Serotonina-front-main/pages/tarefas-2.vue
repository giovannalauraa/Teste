<template>
  <!-- <link href="../assets/css/main.css" rel="stylesheet"> -->
  <div class="fundo">
  <div class="page-holder bg-gray-100 mt-5">
    <b-container class="bv-example-row">
      <menuHamburguer> </menuHamburguer>

      <header class="cabecalho-tarefas-2">
        <nav>
          <h3 class="cabecalho-titulo">Tarefas</h3>
          <img class="tabs" src="~/assets/Tabs.png" alt="Tabs icon" />
        </nav>
      </header>

     
      <!-- Criando Tarefas -->
      <div :key="tarefa.id" v-for="tarefa in tarefas" class="tarefas-lista">
        <ItemListaTarefas
          class="lista"
          :idTarefa="tarefa.id"
          :tarefa="tarefa.tarefa"
        >
        </ItemListaTarefas>
      </div>


      <div id="teste"></div>

      <div class="caixa-baixo">
        <div class="footer">
          <img class="metas" src="~/assets/emoji_events.png" alt="trofeu " />

          <img class="dns" src="~/assets/dns_2.png" alt="dns" />

          <NuxtLink to="/conteudos"
            ><img class="conteudos" src="~/assets/search.png" alt="lupa"
          /></NuxtLink>

         
        </div>

        <section class="info-footer">
        <div class="info-footer-texto">
          <p class="texto-metas">Metas</p>
          <p class="texto-dns">Tarefas</p>
          <p class="texto-conteudos">Conteúdos</p>
        </div>
        </section>

      </div>
    </b-container>
  </div>
</div>
</template>

<script>
export default {
  data() {
    return {
      titulo: 'Conteúdos',
      pessoas: [],
    }
  },
  methods: {
    digaOla() {
      alert('Bem vindo(a) Serotonina!')
    },
  },
}
</script>

