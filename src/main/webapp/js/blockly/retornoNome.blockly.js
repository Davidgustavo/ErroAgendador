window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.RetornoNome = window.blockly.js.blockly.RetornoNome || {};

/**
 * retornoNome
 */
window.blockly.js.blockly.RetornoNome.Executar = function() {

  return 'Nome';
}

/**
 * Descreva esta função...
 */
window.blockly.js.blockly.RetornoNome.retorno = function() {

  this.cronapi.screen.notify('success',this.cronapi.screen.getValueOfField("vars.combobox1802"));
}
