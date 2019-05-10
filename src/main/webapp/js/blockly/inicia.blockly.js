window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.Inicia = window.blockly.js.blockly.Inicia || {};

/**
 * Descreva esta função...
 */
window.blockly.js.blockly.Inicia.incrementas = function(valor) {
 var item, x;
  if (valor == 0) {
    this.cronapi.screen.changeValueOfField("vars.input5110", this.cronapi.conversion.toLong(this.cronapi.screen.getValueOfField("vars.input5110")) - 1);
  } else {
    this.cronapi.screen.changeValueOfField("vars.input5110", this.cronapi.conversion.toLong(this.cronapi.screen.getValueOfField("vars.input5110")) + 1);
  }
}

/**
 * inicia
 */
window.blockly.js.blockly.Inicia.Executar = function() {
 var item, valor, x;
  this.cronapi.screen.changeValueOfField("vars.input5110", '1');
}
