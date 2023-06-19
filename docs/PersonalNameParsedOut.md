
# PersonalNameParsedOut

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**script** | **String** |  |  [optional]
**id** | **String** |  |  [optional]
**explanation** | **String** |  |  [optional]
**name** | **String** | The input name |  [optional]
**nameParserType** | [**NameParserTypeEnum**](#NameParserTypeEnum) | Name parsing is addressed as a classification problem, for example FN1LN1 means a first then last name order. |  [optional]
**nameParserTypeAlt** | [**NameParserTypeAltEnum**](#NameParserTypeAltEnum) | Second best alternative parsing. Name parsing is addressed as a classification problem, for example FN1LN1 means a first then last name order. |  [optional]
**firstLastName** | [**FirstLastNameOut**](FirstLastNameOut.md) |  |  [optional]
**score** | **Double** | Higher score is better, but score is not normalized. Use calibratedProbability if available.  |  [optional]


<a name="NameParserTypeEnum"></a>
## Enum: NameParserTypeEnum
Name | Value
---- | -----
FN1LN1 | &quot;FN1LN1&quot;
LN1FN1 | &quot;LN1FN1&quot;
FN1LN2 | &quot;FN1LN2&quot;
LN2FN1 | &quot;LN2FN1&quot;
FN1LNX | &quot;FN1LNx&quot;
LNXFN1 | &quot;LNxFN1&quot;
FN2LN1 | &quot;FN2LN1&quot;
LN1FN2 | &quot;LN1FN2&quot;
FN2LN2 | &quot;FN2LN2&quot;
LN2FN2 | &quot;LN2FN2&quot;
FN2LNX | &quot;FN2LNx&quot;
LNXFN2 | &quot;LNxFN2&quot;
FNXLN1 | &quot;FNxLN1&quot;
LN1FNX | &quot;LN1FNx&quot;
FNXLN2 | &quot;FNxLN2&quot;
LN2FNX | &quot;LN2FNx&quot;
FNXLNX | &quot;FNxLNx&quot;
LNXFNX | &quot;LNxFNx&quot;


<a name="NameParserTypeAltEnum"></a>
## Enum: NameParserTypeAltEnum
Name | Value
---- | -----
FN1LN1 | &quot;FN1LN1&quot;
LN1FN1 | &quot;LN1FN1&quot;
FN1LN2 | &quot;FN1LN2&quot;
LN2FN1 | &quot;LN2FN1&quot;
FN1LNX | &quot;FN1LNx&quot;
LNXFN1 | &quot;LNxFN1&quot;
FN2LN1 | &quot;FN2LN1&quot;
LN1FN2 | &quot;LN1FN2&quot;
FN2LN2 | &quot;FN2LN2&quot;
LN2FN2 | &quot;LN2FN2&quot;
FN2LNX | &quot;FN2LNx&quot;
LNXFN2 | &quot;LNxFN2&quot;
FNXLN1 | &quot;FNxLN1&quot;
LN1FNX | &quot;LN1FNx&quot;
FNXLN2 | &quot;FNxLN2&quot;
LN2FNX | &quot;LN2FNx&quot;
FNXLNX | &quot;FNxLNx&quot;
LNXFNX | &quot;LNxFNx&quot;



