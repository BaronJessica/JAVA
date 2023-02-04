<?xml version="1.0"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	
	<xsl:template match="//livros">	
		<books>
			<xsl:apply-templates />		
		</books>
	</xsl:template>

	<xsl:template match="livro">
		<book>
			<xsl:value-of select = "./nome"/>
		</book>
	</xsl:template>

</xsl:stylesheet>



