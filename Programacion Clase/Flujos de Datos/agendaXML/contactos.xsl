<?xml version="1.0" encoding="UTF-8"?>

<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

<xsl:template match='/'>
  <html> 
  <xsl:apply-templates /> 
</html>
</xsl:template>

<xsl:template match='agenda'>
  <head><title> Agenda</title></head>
  <body>
   

    <h2>LISTA DE CONTACTOS </h2>
    <table>
      <tr><th>NOMBRE</th><th>TELEFONO</th></tr>
      <xsl:apply-templates select='contacto' />
    </table>
  </body>
</xsl:template>

<xsl:template match='contacto'>
  <tr><xsl:apply-templates /></tr>
</xsl:template>

<xsl:template match='nombre|telefono'>
  <td><xsl:apply-templates /></td>
</xsl:template>

</xsl:stylesheet>
