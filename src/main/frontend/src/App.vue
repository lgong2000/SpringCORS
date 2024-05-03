<script setup lang="ts">
import { onMounted, ref } from "vue";
const coffees = ref([]);

onMounted(() => {
  fetch('http://localhost:8080/api/coffee')
      .then((response) => response.json())
      .then((data) => {
        coffees.value = data;
      });
});
</script>

<template>
  <h1>Coffee List</h1>
  <ul>
    <li v-for="coffee in coffees" :key="coffee.id">
      {{ coffee.name }}
    </li>
  </ul>
</template>
