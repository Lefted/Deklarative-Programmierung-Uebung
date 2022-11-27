<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="/rechnungen">
		<xsl:copy>
			<xsl:for-each select="rechnung[1 > 20100000]">
				<xsl:copy-of select="."></xsl:copy-of>
			</xsl:for-each>
		</xsl:copy>
	</xsl:template>
</xsl:stylesheet>