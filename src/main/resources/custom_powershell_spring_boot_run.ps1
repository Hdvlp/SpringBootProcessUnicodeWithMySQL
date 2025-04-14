# Need to run all the lines below in PowerShell to correctly display:

[Console]::InputEncoding = [System.Text.UTF8Encoding]::new();
[Console]::OutputEncoding = [System.Text.UTF8Encoding]::new();
$PSDefaultParameterValues['*:Encoding'] = 'utf8';
$PSDefaultParameterValues['Out-File:Encoding'] = 'utf8';
$env:JAVA_TOOL_OPTIONS="-Dfile.encoding=UTF8";

$env:processUnicodeDebugging="true";
$env:processUnicodeDataSourceDriverClassName="com.mysql.cj.jdbc.Driver";
$env:processUnicodeDatabasePlatform="org.hibernate.dialect.MySQL8Dialect";
$env:processUnicodeDataSourceUrl="jdbc:mysql://localhost:3306/processunicodedb?useUnicode=true&characterEncoding=UTF-8&useSSL=false&serverTimezone=UTC"
$env:processUnicodeDataSourceUsername="root";
$env:processUnicodeDataSourcePassword="+3wIK_iwaX&&1&LSpFP^p0N992TvNT@@Dty4*225";
./mvnw spring-boot:run;








