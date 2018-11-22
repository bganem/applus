window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.AnexarDocumentos = window.blockly.js.blockly.AnexarDocumentos
		|| {};

/**
 * AnexarDocumentos
 */
window.blockly.js.blockly.AnexarDocumentos.anexarDocumento = function() {
	this.cronapi.screen.nextRecord("Documento");
	return 'Anexe os documento referentes à Atividade Complementar.';
}
