<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description>execution of negative scenarios during user authentication process</description>
   <name>TS-User auth (negative scenarios)</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <lastRun>2018-12-14T12:33:15</lastRun>
   <mailRecipient>stellaireri@gmail.com;stellaireri@ymail.com;</mailRecipient>
   <numberOfRerun>0</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <testSuiteGuid>118dca3d-97d5-4497-9c71-073280bb4cce</testSuiteGuid>
   <testCaseLink>
      <guid>4f71a190-536b-4e69-9241-361c63030ca9</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/User Authentication/TC-Customer registration validation(phone is reuqired)</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>7bd647ca-688a-4327-98e7-4d0ff6eaf9cc</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/Masoko data/TD -Masoko registration</testDataId>
      </testDataLink>
   </testCaseLink>
   <testCaseLink>
      <guid>88bd4a1a-be51-448f-9a55-b0ce4fba48de</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/User Authentication/TC- Login validation(wrong username or password)</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>f084bdec-2682-4d70-8b99-f79003ed266b</id>
         <iterationEntity>
            <iterationType>RANGE</iterationType>
            <value>4-4</value>
         </iterationEntity>
         <testDataId>Data Files/Masoko data/TD- Masoko login</testDataId>
      </testDataLink>
   </testCaseLink>
   <testCaseLink>
      <guid>e88a8d12-0740-4977-970f-484c217bb520</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/User Authentication/TC-Login validation(empty fields)</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>ecf420da-5c0f-4064-ac96-1b50dc191525</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/Masoko data/TD- Masoko login</testDataId>
      </testDataLink>
   </testCaseLink>
</TestSuiteEntity>
