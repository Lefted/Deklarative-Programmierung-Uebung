<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">

	<xsl:template match="/rechnungen">


		<!-- <xsl:element name="rechnungen" namespace="uebung6" xsi:schemaLocation="uebung6 
			Uebung6.xsd"> -->
		<xsl:element name="rechnungen">

			<!-- <xsl:attribute name="xmlns:xsi">http://www.w3.org/2001/XMLSchema-instance</xsl:attribute> 
				<xsl:attribute name="xsi:schemaLocation">uebung6 Uebung6.xsd</xsl:attribute> 
				<xsl:attribute name="xmlns">uebung6</xsl:attribute> <xsl:attribute name="name">XML 
				gefiltert</xsl:attribute> -->

			<xsl:for-each
				select="rechnung[number(translate(ausstellungsdatum, '-', '')) > 20100000]">
				<xsl:copy>
					<xsl:copy-of select="ausstellungsdatum" />
					<xsl:copy-of select="rechnungsnummer" />
					<xsl:apply-templates select="entgelt" />

					<xsl:copy-of
						select="leistungs-empfaenger[starts-with(anrede, 'Herr') or starts-with(anrede, 'Frau')]" />

					<xsl:apply-templates
						select="abrechnungs-positionen" />
				</xsl:copy>
			</xsl:for-each>

		</xsl:element>
	</xsl:template>

	<xsl:template match="entgelt">
		<xsl:copy>
			<xsl:copy-of select="bruttobetrag" />
		</xsl:copy>
	</xsl:template>

	<xsl:template match="abrechnungs-positionen">
		<xsl:copy>
			<xsl:for-each select="abrechnungs-position">
				<xsl:copy>
					<xsl:attribute name="positionsnummer">
						<xsl:value-of select="position()" />
					</xsl:attribute>


					<xsl:copy-of select="leistung" />
					<xsl:copy-of select="gesamt-preis" />
				</xsl:copy>
			</xsl:for-each>
		</xsl:copy>
	</xsl:template>
</xsl:stylesheet>