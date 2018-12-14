<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description>user authentication proccess including creating a user upto signing in to masoko.com website</description>
   <name>TS- User auth</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient>stellaireri@gmail.com;stellaireri@ymail.com;</mailRecipient>
   <numberOfRerun>0</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <testSuiteGuid>2b2a7443-6283-44bc-842e-d79f7c4de626</testSuiteGuid>
   <testCaseLink>
      <guid>f9a70966-8b4e-43fb-bb89-c7ea071fb89e</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/User Authentication/TC-Customer registration</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>ae057099-d9cf-4168-ab24-4426f51ceb7d</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/Masoko data/TD -Masoko registration</testDataId>
      </testDataLink>
   </testCaseLink>
   <testCaseLink>
      <guid>6a4a4a5e-ed95-4432-9c38-1ee4e6920cfa</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/User Authentication/TC-Login</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>f1bd85f0-9ca0-46c5-b484-ea4592e1c4a7</id>
         <iterationEntity>
            <iterationType>RANGE</iterationType>
            <value>1-1</value>
         </iterationEntity>
         <testDataId>Data Files/Masoko data/TD- Masoko login</testDataId>
      </testDataLink>
   </testCaseLink>
</TestSuiteEntity>
