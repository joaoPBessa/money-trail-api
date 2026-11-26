# revenue-type proofs

**HEAD**: 62d9ad1
**Tree**: clean
**Shell**: C:/Program Files/Git\bin\bash.exe
**Result**: 41 pass, 0 fail

| Check | Proof | Result |
| --- | --- | --- |
| C1 | `./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeServiceTest#create_savesAndReturnsType_whenValidAndNameU` | pass |
| C2 | `./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeServiceTest#create_throwsDuplicate_whenNameExistsCaseIns` | pass |
| C3 | `./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeServiceTest#create_throwsDuplicate_whenNameDiffersOnlyBy` | pass |
| C4 | `./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeServiceTest#findAll_returnsAllOrderedByCreatedAtAscendin` | pass |
| C5 | `./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeServiceTest#findById_returnsType_whenExists` | pass |
| C6 | `./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeServiceTest#findById_throwsNotFound_whenIdMissing` | pass |
| C7 | `./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeServiceTest#update_savesChangesAndReturnsType_whenExists` | pass |
| C8 | `./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeServiceTest#update_throwsNotFound_whenIdMissing` | pass |
| C9 | `./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeServiceTest#update_throwsDuplicate_whenNameUsedByDiffere` | pass |
| C10 | `./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeServiceTest#update_allowsSameTypeKeepingItsOwnName` | pass |
| C11 | `./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeServiceTest#delete_removesType_whenExists` | pass |
| C12 | `./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeServiceTest#delete_throwsNotFound_whenIdMissing` | pass |
| C13 | `./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeControllerTest#createType_returns201WithLocationHeader_w` | pass |
| C14 | `./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeControllerTest#createType_returns400_whenNameBlank` | pass |
| C15 | `./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeControllerTest#createType_returns400_whenNameTooLong` | pass |
| C16 | `./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeControllerTest#createType_returns409_whenServiceThrowsDu` | pass |
| C17 | `./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeControllerTest#listTypes_returns200WithAllTypes_whenServ` | pass |
| C18 | `./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeControllerTest#listTypes_returns200WithEmptyArray_whenNo` | pass |
| C19 | `./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeControllerTest#getType_returns200WithBody_whenExists` | pass |
| C20 | `./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeControllerTest#getType_returns404_whenServiceThrowsNotFo` | pass |
| C21 | `./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeControllerTest#updateType_returns200WithUpdatedBody_when` | pass |
| C22 | `./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeControllerTest#updateType_returns404_whenServiceThrowsNo` | pass |
| C23 | `./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeControllerTest#updateType_returns409_whenServiceThrowsDu` | pass |
| C24 | `./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeControllerTest#deleteType_returns204_whenServiceSucceeds` | pass |
| C25 | `./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeControllerTest#deleteType_returns404_whenServiceThrowsNo` | pass |
| C26 | `./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeAcceptanceTest#freshDatabase_containsSixSeededRevenueTyp` | pass |
| C27 | `./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeAcceptanceTest#createRevenueType_persistsAndReturns201Wi` | pass |
| C28 | `./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeAcceptanceTest#createRevenueType_returns400_whenNameBlan` | pass |
| C29 | `./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeAcceptanceTest#createRevenueType_returns400_whenNameExce` | pass |
| C30 | `./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeAcceptanceTest#createRevenueType_returns409_whenNameDupl` | pass |
| C31 | `./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeAcceptanceTest#listRevenueTypes_returns200WithAllPersist` | pass |
| C32 | `./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeAcceptanceTest#getRevenueType_returns200_whenExists` | pass |
| C33 | `./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeAcceptanceTest#getRevenueType_returns404_whenMissing` | pass |
| C34 | `./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeAcceptanceTest#updateRevenueType_returns200AndPersistsCh` | pass |
| C35 | `./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeAcceptanceTest#updateRevenueType_returns404_whenIdMissin` | pass |
| C36 | `./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeAcceptanceTest#updateRevenueType_returns409_whenNameDupl` | pass |
| C37 | `./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeAcceptanceTest#updateASeededType_isAcceptedWithNoProtect` | pass |
| C38 | `./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeAcceptanceTest#deleteRevenueType_returns204AndRemovesRec` | pass |
| C39 | `./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeAcceptanceTest#deleteRevenueType_returns404_whenIdMissin` | pass |
| C40 | `./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeAcceptanceTest#deleteASeededType_isAcceptedWithNoProtect` | pass |
| Build | `./mvnw -B verify` | pass |

## Output

`./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeServiceTest#create_savesAndReturnsType_whenValidAndNameU` - exit 0

```
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeServiceTest#create_throwsDuplicate_whenNameExistsCaseIns` - exit 0

```
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeServiceTest#create_throwsDuplicate_whenNameDiffersOnlyBy` - exit 0

```
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeServiceTest#findAll_returnsAllOrderedByCreatedAtAscendin` - exit 0

```
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeServiceTest#findById_returnsType_whenExists` - exit 0

```
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeServiceTest#findById_throwsNotFound_whenIdMissing` - exit 0

```
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeServiceTest#update_savesChangesAndReturnsType_whenExists` - exit 0

```
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeServiceTest#update_throwsNotFound_whenIdMissing` - exit 0

```
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeServiceTest#update_throwsDuplicate_whenNameUsedByDiffere` - exit 0

```
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeServiceTest#update_allowsSameTypeKeepingItsOwnName` - exit 0

```
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeServiceTest#delete_removesType_whenExists` - exit 0

```
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeServiceTest#delete_throwsNotFound_whenIdMissing` - exit 0

```
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeControllerTest#createType_returns201WithLocationHeader_w` - exit 0

```
17:06:26.459 [main] INFO org.hibernate.validator.internal.util.Version -- HV000001: Hibernate Validator 9.1.6.Final
17:06:26.790 [main] INFO org.springframework.mock.web.MockServletContext -- Initializing Spring TestDispatcherServlet ''
17:06:26.791 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet -- Initializing Servlet ''
17:06:26.796 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet -- Completed initialization in 3 ms
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeControllerTest#createType_returns400_whenNameBlank` - exit 0

```
17:06:40.380 [main] INFO org.hibernate.validator.internal.util.Version -- HV000001: Hibernate Validator 9.1.6.Final
17:06:40.680 [main] INFO org.springframework.mock.web.MockServletContext -- Initializing Spring TestDispatcherServlet ''
17:06:40.681 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet -- Initializing Servlet ''
17:06:40.686 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet -- Completed initialization in 2 ms
17:06:40.963 [main] WARN org.springframework.web.servlet.mvc.support.DefaultHandlerExceptionResolver -- Resolved [org.springframework.web.bind.MethodArgumentNotValidException: Validation failed for argument [0] in public org.springframework.http.ResponseEntity<com.moneytrail.api.revenuetype.dto.RevenueTypeResponse> com.moneytrail.api.revenuetype.RevenueTypeController.create(com.moneytrail.api.revenuetype.dto.RevenueTypeRequest): [Field error in object 'revenueTypeRequest' on field 'name': rejected value [ ]; codes [NotBlank.revenueTypeRequest.name,NotBlank.name,NotBlank.java.lang.String,NotBlank]; arguments [org.springframework.context.support.DefaultMessageSourceResolvable: codes [revenueTypeRequest.name,name]; arguments []; default message [name]]; default message [must not be blank]] ]
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeControllerTest#createType_returns400_whenNameTooLong` - exit 0

```
17:06:52.841 [main] INFO org.hibernate.validator.internal.util.Version -- HV000001: Hibernate Validator 9.1.6.Final
17:06:53.134 [main] INFO org.springframework.mock.web.MockServletContext -- Initializing Spring TestDispatcherServlet ''
17:06:53.136 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet -- Initializing Servlet ''
17:06:53.140 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet -- Completed initialization in 2 ms
17:06:53.369 [main] WARN org.springframework.web.servlet.mvc.support.DefaultHandlerExceptionResolver -- Resolved [org.springframework.web.bind.MethodArgumentNotValidException: Validation failed for argument [0] in public org.springframework.http.ResponseEntity<com.moneytrail.api.revenuetype.dto.RevenueTypeResponse> com.moneytrail.api.revenuetype.RevenueTypeController.create(com.moneytrail.api.revenuetype.dto.RevenueTypeRequest): [Field error in object 'revenueTypeRequest' on field 'name': rejected value [aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa]; codes [Size.revenueTypeRequest.name,Size.name,Size.java.lang.String,Size]; arguments [org.springframework.context.support.DefaultMessageSourceResolvable: codes [revenueTypeRequest.name,name]; arguments []; default message [name],100,0]; default message [size must be between 0 and 100]] ]
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeControllerTest#createType_returns409_whenServiceThrowsDu` - exit 0

```
17:07:02.868 [main] INFO org.hibernate.validator.internal.util.Version -- HV000001: Hibernate Validator 9.1.6.Final
17:07:03.186 [main] INFO org.springframework.mock.web.MockServletContext -- Initializing Spring TestDispatcherServlet ''
17:07:03.188 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet -- Initializing Servlet ''
17:07:03.192 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet -- Completed initialization in 2 ms
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeControllerTest#listTypes_returns200WithAllTypes_whenServ` - exit 0

```
17:07:13.755 [main] INFO org.hibernate.validator.internal.util.Version -- HV000001: Hibernate Validator 9.1.6.Final
17:07:14.048 [main] INFO org.springframework.mock.web.MockServletContext -- Initializing Spring TestDispatcherServlet ''
17:07:14.050 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet -- Initializing Servlet ''
17:07:14.054 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet -- Completed initialization in 2 ms
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeControllerTest#listTypes_returns200WithEmptyArray_whenNo` - exit 0

```
17:07:26.215 [main] INFO org.hibernate.validator.internal.util.Version -- HV000001: Hibernate Validator 9.1.6.Final
17:07:26.564 [main] INFO org.springframework.mock.web.MockServletContext -- Initializing Spring TestDispatcherServlet ''
17:07:26.566 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet -- Initializing Servlet ''
17:07:26.572 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet -- Completed initialization in 4 ms
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeControllerTest#getType_returns200WithBody_whenExists` - exit 0

```
17:07:38.665 [main] INFO org.hibernate.validator.internal.util.Version -- HV000001: Hibernate Validator 9.1.6.Final
17:07:38.973 [main] INFO org.springframework.mock.web.MockServletContext -- Initializing Spring TestDispatcherServlet ''
17:07:38.975 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet -- Initializing Servlet ''
17:07:38.979 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet -- Completed initialization in 2 ms
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeControllerTest#getType_returns404_whenServiceThrowsNotFo` - exit 0

```
17:07:52.281 [main] INFO org.hibernate.validator.internal.util.Version -- HV000001: Hibernate Validator 9.1.6.Final
17:07:52.587 [main] INFO org.springframework.mock.web.MockServletContext -- Initializing Spring TestDispatcherServlet ''
17:07:52.589 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet -- Initializing Servlet ''
17:07:52.594 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet -- Completed initialization in 3 ms
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeControllerTest#updateType_returns200WithUpdatedBody_when` - exit 0

```
17:08:03.466 [main] INFO org.hibernate.validator.internal.util.Version -- HV000001: Hibernate Validator 9.1.6.Final
17:08:03.764 [main] INFO org.springframework.mock.web.MockServletContext -- Initializing Spring TestDispatcherServlet ''
17:08:03.766 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet -- Initializing Servlet ''
17:08:03.770 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet -- Completed initialization in 3 ms
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeControllerTest#updateType_returns404_whenServiceThrowsNo` - exit 0

```
17:08:14.541 [main] INFO org.hibernate.validator.internal.util.Version -- HV000001: Hibernate Validator 9.1.6.Final
17:08:14.848 [main] INFO org.springframework.mock.web.MockServletContext -- Initializing Spring TestDispatcherServlet ''
17:08:14.850 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet -- Initializing Servlet ''
17:08:14.855 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet -- Completed initialization in 2 ms
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeControllerTest#updateType_returns409_whenServiceThrowsDu` - exit 0

```
17:08:26.970 [main] INFO org.hibernate.validator.internal.util.Version -- HV000001: Hibernate Validator 9.1.6.Final
17:08:27.284 [main] INFO org.springframework.mock.web.MockServletContext -- Initializing Spring TestDispatcherServlet ''
17:08:27.286 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet -- Initializing Servlet ''
17:08:27.290 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet -- Completed initialization in 3 ms
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeControllerTest#deleteType_returns204_whenServiceSucceeds` - exit 0

```
17:08:37.409 [main] INFO org.hibernate.validator.internal.util.Version -- HV000001: Hibernate Validator 9.1.6.Final
17:08:37.709 [main] INFO org.springframework.mock.web.MockServletContext -- Initializing Spring TestDispatcherServlet ''
17:08:37.711 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet -- Initializing Servlet ''
17:08:37.715 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet -- Completed initialization in 2 ms
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeControllerTest#deleteType_returns404_whenServiceThrowsNo` - exit 0

```
17:08:50.672 [main] INFO org.hibernate.validator.internal.util.Version -- HV000001: Hibernate Validator 9.1.6.Final
17:08:50.972 [main] INFO org.springframework.mock.web.MockServletContext -- Initializing Spring TestDispatcherServlet ''
17:08:50.973 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet -- Initializing Servlet ''
17:08:50.977 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet -- Completed initialization in 2 ms
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeAcceptanceTest#freshDatabase_containsSixSeededRevenueTyp` - exit 0

```
	Maximum pool size: undefined/unknown
2026-11-26T17:09:09.590-03:00  INFO 18504 --- [money-trail-api] [           main] org.hibernate.orm.core                   : HHH000489: No JTA platform available (set 'hibernate.transaction.jta.platform' to enable JTA platform integration)
2026-11-26T17:09:09.727-03:00  INFO 18504 --- [money-trail-api] [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2026-11-26T17:09:10.688-03:00  INFO 18504 --- [money-trail-api] [           main] o.s.d.j.r.query.QueryEnhancerFactories   : Hibernate is in classpath; If applicable, HQL parser will be used.
2026-11-26T17:09:13.782-03:00  INFO 18504 --- [money-trail-api] [           main] o.s.b.t.m.w.SpringBootMockServletContext : Initializing Spring TestDispatcherServlet ''
2026-11-26T17:09:13.784-03:00  INFO 18504 --- [money-trail-api] [           main] o.s.t.web.servlet.TestDispatcherServlet  : Initializing Servlet ''
2026-11-26T17:09:13.804-03:00  INFO 18504 --- [money-trail-api] [           main] o.s.b.a.e.web.EndpointLinksResolver      : Exposing 2 endpoints beneath base path '/actuator'
2026-11-26T17:09:13.833-03:00  INFO 18504 --- [money-trail-api] [           main] o.s.t.web.servlet.TestDispatcherServlet  : Completed initialization in 49 ms
2026-11-26T17:09:14.098-03:00  INFO 18504 --- [money-trail-api] [           main] c.m.a.r.RevenueTypeAcceptanceTest        : Started RevenueTypeAcceptanceTest in 12.887 seconds (process running for 14.224)
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeAcceptanceTest#createRevenueType_persistsAndReturns201Wi` - exit 0

```
	Maximum pool size: undefined/unknown
2026-11-26T17:09:34.637-03:00  INFO 21656 --- [money-trail-api] [           main] org.hibernate.orm.core                   : HHH000489: No JTA platform available (set 'hibernate.transaction.jta.platform' to enable JTA platform integration)
2026-11-26T17:09:34.743-03:00  INFO 21656 --- [money-trail-api] [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2026-11-26T17:09:35.895-03:00  INFO 21656 --- [money-trail-api] [           main] o.s.d.j.r.query.QueryEnhancerFactories   : Hibernate is in classpath; If applicable, HQL parser will be used.
2026-11-26T17:09:39.346-03:00  INFO 21656 --- [money-trail-api] [           main] o.s.b.t.m.w.SpringBootMockServletContext : Initializing Spring TestDispatcherServlet ''
2026-11-26T17:09:39.347-03:00  INFO 21656 --- [money-trail-api] [           main] o.s.t.web.servlet.TestDispatcherServlet  : Initializing Servlet ''
2026-11-26T17:09:39.367-03:00  INFO 21656 --- [money-trail-api] [           main] o.s.b.a.e.web.EndpointLinksResolver      : Exposing 2 endpoints beneath base path '/actuator'
2026-11-26T17:09:39.476-03:00  INFO 21656 --- [money-trail-api] [           main] o.s.t.web.servlet.TestDispatcherServlet  : Completed initialization in 128 ms
2026-11-26T17:09:39.742-03:00  INFO 21656 --- [money-trail-api] [           main] c.m.a.r.RevenueTypeAcceptanceTest        : Started RevenueTypeAcceptanceTest in 12.989 seconds (process running for 14.276)
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeAcceptanceTest#createRevenueType_returns400_whenNameBlan` - exit 0

```
2026-11-26T17:10:01.699-03:00  INFO 21636 --- [money-trail-api] [           main] org.hibernate.orm.core                   : HHH000489: No JTA platform available (set 'hibernate.transaction.jta.platform' to enable JTA platform integration)
2026-11-26T17:10:01.789-03:00  INFO 21636 --- [money-trail-api] [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2026-11-26T17:10:03.027-03:00  INFO 21636 --- [money-trail-api] [           main] o.s.d.j.r.query.QueryEnhancerFactories   : Hibernate is in classpath; If applicable, HQL parser will be used.
2026-11-26T17:10:06.491-03:00  INFO 21636 --- [money-trail-api] [           main] o.s.b.t.m.w.SpringBootMockServletContext : Initializing Spring TestDispatcherServlet ''
2026-11-26T17:10:06.492-03:00  INFO 21636 --- [money-trail-api] [           main] o.s.t.web.servlet.TestDispatcherServlet  : Initializing Servlet ''
2026-11-26T17:10:06.519-03:00  INFO 21636 --- [money-trail-api] [           main] o.s.b.a.e.web.EndpointLinksResolver      : Exposing 2 endpoints beneath base path '/actuator'
2026-11-26T17:10:06.547-03:00  INFO 21636 --- [money-trail-api] [           main] o.s.t.web.servlet.TestDispatcherServlet  : Completed initialization in 54 ms
2026-11-26T17:10:06.708-03:00  INFO 21636 --- [money-trail-api] [           main] c.m.a.r.RevenueTypeAcceptanceTest        : Started RevenueTypeAcceptanceTest in 15.087 seconds (process running for 16.361)
2026-11-26T17:10:08.803-03:00  WARN 21636 --- [money-trail-api] [           main] .w.s.m.s.DefaultHandlerExceptionResolver : Resolved [org.springframework.web.bind.MethodArgumentNotValidException: Validation failed for argument [0] in public org.springframework.http.ResponseEntity<com.moneytrail.api.revenuetype.dto.RevenueTypeResponse> com.moneytrail.api.revenuetype.RevenueTypeController.create(com.moneytrail.api.revenuetype.dto.RevenueTypeRequest): [Field error in object 'revenueTypeRequest' on field 'name': rejected value [ ]; codes [NotBlank.revenueTypeRequest.name,NotBlank.name,NotBlank.java.lang.String,NotBlank]; arguments [org.springframework.context.support.DefaultMessageSourceResolvable: codes [revenueTypeRequest.name,name]; arguments []; default message [name]]; default message [must not be blank]] ]
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeAcceptanceTest#createRevenueType_returns400_whenNameExce` - exit 0

```
2026-11-26T17:10:26.505-03:00  INFO 23280 --- [money-trail-api] [           main] org.hibernate.orm.core                   : HHH000489: No JTA platform available (set 'hibernate.transaction.jta.platform' to enable JTA platform integration)
2026-11-26T17:10:26.625-03:00  INFO 23280 --- [money-trail-api] [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2026-11-26T17:10:27.217-03:00  INFO 23280 --- [money-trail-api] [           main] o.s.d.j.r.query.QueryEnhancerFactories   : Hibernate is in classpath; If applicable, HQL parser will be used.
2026-11-26T17:10:30.534-03:00  INFO 23280 --- [money-trail-api] [           main] o.s.b.t.m.w.SpringBootMockServletContext : Initializing Spring TestDispatcherServlet ''
2026-11-26T17:10:30.535-03:00  INFO 23280 --- [money-trail-api] [           main] o.s.t.web.servlet.TestDispatcherServlet  : Initializing Servlet ''
2026-11-26T17:10:30.569-03:00  INFO 23280 --- [money-trail-api] [           main] o.s.b.a.e.web.EndpointLinksResolver      : Exposing 2 endpoints beneath base path '/actuator'
2026-11-26T17:10:30.608-03:00  INFO 23280 --- [money-trail-api] [           main] o.s.t.web.servlet.TestDispatcherServlet  : Completed initialization in 72 ms
2026-11-26T17:10:30.862-03:00  INFO 23280 --- [money-trail-api] [           main] c.m.a.r.RevenueTypeAcceptanceTest        : Started RevenueTypeAcceptanceTest in 12.963 seconds (process running for 14.214)
2026-11-26T17:10:33.003-03:00  WARN 23280 --- [money-trail-api] [           main] .w.s.m.s.DefaultHandlerExceptionResolver : Resolved [org.springframework.web.bind.MethodArgumentNotValidException: Validation failed for argument [0] in public org.springframework.http.ResponseEntity<com.moneytrail.api.revenuetype.dto.RevenueTypeResponse> com.moneytrail.api.revenuetype.RevenueTypeController.create(com.moneytrail.api.revenuetype.dto.RevenueTypeRequest): [Field error in object 'revenueTypeRequest' on field 'name': rejected value [aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa]; codes [Size.revenueTypeRequest.name,Size.name,Size.java.lang.String,Size]; arguments [org.springframework.context.support.DefaultMessageSourceResolvable: codes [revenueTypeRequest.name,name]; arguments []; default message [name],100,0]; default message [size must be between 0 and 100]] ]
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeAcceptanceTest#createRevenueType_returns409_whenNameDupl` - exit 0

```
	Maximum pool size: undefined/unknown
2026-11-26T17:10:49.730-03:00  INFO 34896 --- [money-trail-api] [           main] org.hibernate.orm.core                   : HHH000489: No JTA platform available (set 'hibernate.transaction.jta.platform' to enable JTA platform integration)
2026-11-26T17:10:49.837-03:00  INFO 34896 --- [money-trail-api] [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2026-11-26T17:10:50.850-03:00  INFO 34896 --- [money-trail-api] [           main] o.s.d.j.r.query.QueryEnhancerFactories   : Hibernate is in classpath; If applicable, HQL parser will be used.
2026-11-26T17:10:54.491-03:00  INFO 34896 --- [money-trail-api] [           main] o.s.b.t.m.w.SpringBootMockServletContext : Initializing Spring TestDispatcherServlet ''
2026-11-26T17:10:54.492-03:00  INFO 34896 --- [money-trail-api] [           main] o.s.t.web.servlet.TestDispatcherServlet  : Initializing Servlet ''
2026-11-26T17:10:54.556-03:00  INFO 34896 --- [money-trail-api] [           main] o.s.b.a.e.web.EndpointLinksResolver      : Exposing 2 endpoints beneath base path '/actuator'
2026-11-26T17:10:54.619-03:00  INFO 34896 --- [money-trail-api] [           main] o.s.t.web.servlet.TestDispatcherServlet  : Completed initialization in 127 ms
2026-11-26T17:10:54.794-03:00  INFO 34896 --- [money-trail-api] [           main] c.m.a.r.RevenueTypeAcceptanceTest        : Started RevenueTypeAcceptanceTest in 12.427 seconds (process running for 13.647)
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeAcceptanceTest#listRevenueTypes_returns200WithAllPersist` - exit 0

```
	Maximum pool size: undefined/unknown
2026-11-26T17:11:21.553-03:00  INFO 36004 --- [money-trail-api] [           main] org.hibernate.orm.core                   : HHH000489: No JTA platform available (set 'hibernate.transaction.jta.platform' to enable JTA platform integration)
2026-11-26T17:11:21.656-03:00  INFO 36004 --- [money-trail-api] [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2026-11-26T17:11:22.155-03:00  INFO 36004 --- [money-trail-api] [           main] o.s.d.j.r.query.QueryEnhancerFactories   : Hibernate is in classpath; If applicable, HQL parser will be used.
2026-11-26T17:11:26.186-03:00  INFO 36004 --- [money-trail-api] [           main] o.s.b.t.m.w.SpringBootMockServletContext : Initializing Spring TestDispatcherServlet ''
2026-11-26T17:11:26.186-03:00  INFO 36004 --- [money-trail-api] [           main] o.s.t.web.servlet.TestDispatcherServlet  : Initializing Servlet ''
2026-11-26T17:11:26.256-03:00  INFO 36004 --- [money-trail-api] [           main] o.s.b.a.e.web.EndpointLinksResolver      : Exposing 2 endpoints beneath base path '/actuator'
2026-11-26T17:11:26.279-03:00  INFO 36004 --- [money-trail-api] [           main] o.s.t.web.servlet.TestDispatcherServlet  : Completed initialization in 83 ms
2026-11-26T17:11:26.532-03:00  INFO 36004 --- [money-trail-api] [           main] c.m.a.r.RevenueTypeAcceptanceTest        : Started RevenueTypeAcceptanceTest in 15.281 seconds (process running for 16.896)
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeAcceptanceTest#getRevenueType_returns200_whenExists` - exit 0

```
	Maximum pool size: undefined/unknown
2026-11-26T17:11:55.158-03:00  INFO 34848 --- [money-trail-api] [           main] org.hibernate.orm.core                   : HHH000489: No JTA platform available (set 'hibernate.transaction.jta.platform' to enable JTA platform integration)
2026-11-26T17:11:55.284-03:00  INFO 34848 --- [money-trail-api] [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2026-11-26T17:11:56.051-03:00  INFO 34848 --- [money-trail-api] [           main] o.s.d.j.r.query.QueryEnhancerFactories   : Hibernate is in classpath; If applicable, HQL parser will be used.
2026-11-26T17:11:59.277-03:00  INFO 34848 --- [money-trail-api] [           main] o.s.b.t.m.w.SpringBootMockServletContext : Initializing Spring TestDispatcherServlet ''
2026-11-26T17:11:59.279-03:00  INFO 34848 --- [money-trail-api] [           main] o.s.t.web.servlet.TestDispatcherServlet  : Initializing Servlet ''
2026-11-26T17:11:59.349-03:00  INFO 34848 --- [money-trail-api] [           main] o.s.b.a.e.web.EndpointLinksResolver      : Exposing 2 endpoints beneath base path '/actuator'
2026-11-26T17:11:59.371-03:00  INFO 34848 --- [money-trail-api] [           main] o.s.t.web.servlet.TestDispatcherServlet  : Completed initialization in 92 ms
2026-11-26T17:11:59.625-03:00  INFO 34848 --- [money-trail-api] [           main] c.m.a.r.RevenueTypeAcceptanceTest        : Started RevenueTypeAcceptanceTest in 12.203 seconds (process running for 13.502)
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeAcceptanceTest#getRevenueType_returns404_whenMissing` - exit 0

```
	Maximum pool size: undefined/unknown
2026-11-26T17:12:24.531-03:00  INFO 6008 --- [money-trail-api] [           main] org.hibernate.orm.core                   : HHH000489: No JTA platform available (set 'hibernate.transaction.jta.platform' to enable JTA platform integration)
2026-11-26T17:12:24.652-03:00  INFO 6008 --- [money-trail-api] [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2026-11-26T17:12:25.753-03:00  INFO 6008 --- [money-trail-api] [           main] o.s.d.j.r.query.QueryEnhancerFactories   : Hibernate is in classpath; If applicable, HQL parser will be used.
2026-11-26T17:12:28.939-03:00  INFO 6008 --- [money-trail-api] [           main] o.s.b.t.m.w.SpringBootMockServletContext : Initializing Spring TestDispatcherServlet ''
2026-11-26T17:12:28.939-03:00  INFO 6008 --- [money-trail-api] [           main] o.s.t.web.servlet.TestDispatcherServlet  : Initializing Servlet ''
2026-11-26T17:12:28.954-03:00  INFO 6008 --- [money-trail-api] [           main] o.s.b.a.e.web.EndpointLinksResolver      : Exposing 2 endpoints beneath base path '/actuator'
2026-11-26T17:12:28.975-03:00  INFO 6008 --- [money-trail-api] [           main] o.s.t.web.servlet.TestDispatcherServlet  : Completed initialization in 33 ms
2026-11-26T17:12:29.239-03:00  INFO 6008 --- [money-trail-api] [           main] c.m.a.r.RevenueTypeAcceptanceTest        : Started RevenueTypeAcceptanceTest in 13.107 seconds (process running for 14.431)
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeAcceptanceTest#updateRevenueType_returns200AndPersistsCh` - exit 0

```
	Maximum pool size: undefined/unknown
2026-11-26T17:12:48.266-03:00  INFO 20128 --- [money-trail-api] [           main] org.hibernate.orm.core                   : HHH000489: No JTA platform available (set 'hibernate.transaction.jta.platform' to enable JTA platform integration)
2026-11-26T17:12:48.370-03:00  INFO 20128 --- [money-trail-api] [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2026-11-26T17:12:48.967-03:00  INFO 20128 --- [money-trail-api] [           main] o.s.d.j.r.query.QueryEnhancerFactories   : Hibernate is in classpath; If applicable, HQL parser will be used.
2026-11-26T17:12:52.594-03:00  INFO 20128 --- [money-trail-api] [           main] o.s.b.t.m.w.SpringBootMockServletContext : Initializing Spring TestDispatcherServlet ''
2026-11-26T17:12:52.602-03:00  INFO 20128 --- [money-trail-api] [           main] o.s.t.web.servlet.TestDispatcherServlet  : Initializing Servlet ''
2026-11-26T17:12:52.649-03:00  INFO 20128 --- [money-trail-api] [           main] o.s.b.a.e.web.EndpointLinksResolver      : Exposing 2 endpoints beneath base path '/actuator'
2026-11-26T17:12:52.677-03:00  INFO 20128 --- [money-trail-api] [           main] o.s.t.web.servlet.TestDispatcherServlet  : Completed initialization in 75 ms
2026-11-26T17:12:52.899-03:00  INFO 20128 --- [money-trail-api] [           main] c.m.a.r.RevenueTypeAcceptanceTest        : Started RevenueTypeAcceptanceTest in 11.778 seconds (process running for 13.068)
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeAcceptanceTest#updateRevenueType_returns404_whenIdMissin` - exit 0

```
	Maximum pool size: undefined/unknown
2026-11-26T17:13:10.906-03:00  INFO 36700 --- [money-trail-api] [           main] org.hibernate.orm.core                   : HHH000489: No JTA platform available (set 'hibernate.transaction.jta.platform' to enable JTA platform integration)
2026-11-26T17:13:11.012-03:00  INFO 36700 --- [money-trail-api] [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2026-11-26T17:13:11.900-03:00  INFO 36700 --- [money-trail-api] [           main] o.s.d.j.r.query.QueryEnhancerFactories   : Hibernate is in classpath; If applicable, HQL parser will be used.
2026-11-26T17:13:17.065-03:00  INFO 36700 --- [money-trail-api] [           main] o.s.b.t.m.w.SpringBootMockServletContext : Initializing Spring TestDispatcherServlet ''
2026-11-26T17:13:17.073-03:00  INFO 36700 --- [money-trail-api] [           main] o.s.t.web.servlet.TestDispatcherServlet  : Initializing Servlet ''
2026-11-26T17:13:17.120-03:00  INFO 36700 --- [money-trail-api] [           main] o.s.b.a.e.web.EndpointLinksResolver      : Exposing 2 endpoints beneath base path '/actuator'
2026-11-26T17:13:17.169-03:00  INFO 36700 --- [money-trail-api] [           main] o.s.t.web.servlet.TestDispatcherServlet  : Completed initialization in 96 ms
2026-11-26T17:13:17.571-03:00  INFO 36700 --- [money-trail-api] [           main] c.m.a.r.RevenueTypeAcceptanceTest        : Started RevenueTypeAcceptanceTest in 13.82 seconds (process running for 15.093)
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeAcceptanceTest#updateRevenueType_returns409_whenNameDupl` - exit 0

```
	Maximum pool size: undefined/unknown
2026-11-26T17:13:39.669-03:00  INFO 28132 --- [money-trail-api] [           main] org.hibernate.orm.core                   : HHH000489: No JTA platform available (set 'hibernate.transaction.jta.platform' to enable JTA platform integration)
2026-11-26T17:13:39.769-03:00  INFO 28132 --- [money-trail-api] [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2026-11-26T17:13:40.464-03:00  INFO 28132 --- [money-trail-api] [           main] o.s.d.j.r.query.QueryEnhancerFactories   : Hibernate is in classpath; If applicable, HQL parser will be used.
2026-11-26T17:13:44.153-03:00  INFO 28132 --- [money-trail-api] [           main] o.s.b.t.m.w.SpringBootMockServletContext : Initializing Spring TestDispatcherServlet ''
2026-11-26T17:13:44.154-03:00  INFO 28132 --- [money-trail-api] [           main] o.s.t.web.servlet.TestDispatcherServlet  : Initializing Servlet ''
2026-11-26T17:13:44.171-03:00  INFO 28132 --- [money-trail-api] [           main] o.s.b.a.e.web.EndpointLinksResolver      : Exposing 2 endpoints beneath base path '/actuator'
2026-11-26T17:13:44.190-03:00  INFO 28132 --- [money-trail-api] [           main] o.s.t.web.servlet.TestDispatcherServlet  : Completed initialization in 36 ms
2026-11-26T17:13:44.365-03:00  INFO 28132 --- [money-trail-api] [           main] c.m.a.r.RevenueTypeAcceptanceTest        : Started RevenueTypeAcceptanceTest in 11.898 seconds (process running for 13.183)
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeAcceptanceTest#updateASeededType_isAcceptedWithNoProtect` - exit 0

```
	Maximum pool size: undefined/unknown
2026-11-26T17:14:02.514-03:00  INFO 6148 --- [money-trail-api] [           main] org.hibernate.orm.core                   : HHH000489: No JTA platform available (set 'hibernate.transaction.jta.platform' to enable JTA platform integration)
2026-11-26T17:14:02.653-03:00  INFO 6148 --- [money-trail-api] [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2026-11-26T17:14:03.254-03:00  INFO 6148 --- [money-trail-api] [           main] o.s.d.j.r.query.QueryEnhancerFactories   : Hibernate is in classpath; If applicable, HQL parser will be used.
2026-11-26T17:14:06.642-03:00  INFO 6148 --- [money-trail-api] [           main] o.s.b.t.m.w.SpringBootMockServletContext : Initializing Spring TestDispatcherServlet ''
2026-11-26T17:14:06.642-03:00  INFO 6148 --- [money-trail-api] [           main] o.s.t.web.servlet.TestDispatcherServlet  : Initializing Servlet ''
2026-11-26T17:14:06.664-03:00  INFO 6148 --- [money-trail-api] [           main] o.s.b.a.e.web.EndpointLinksResolver      : Exposing 2 endpoints beneath base path '/actuator'
2026-11-26T17:14:06.681-03:00  INFO 6148 --- [money-trail-api] [           main] o.s.t.web.servlet.TestDispatcherServlet  : Completed initialization in 39 ms
2026-11-26T17:14:06.846-03:00  INFO 6148 --- [money-trail-api] [           main] c.m.a.r.RevenueTypeAcceptanceTest        : Started RevenueTypeAcceptanceTest in 11.384 seconds (process running for 12.602)
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeAcceptanceTest#deleteRevenueType_returns204AndRemovesRec` - exit 0

```
	Maximum pool size: undefined/unknown
2026-11-26T17:14:27.807-03:00  INFO 17948 --- [money-trail-api] [           main] org.hibernate.orm.core                   : HHH000489: No JTA platform available (set 'hibernate.transaction.jta.platform' to enable JTA platform integration)
2026-11-26T17:14:28.039-03:00  INFO 17948 --- [money-trail-api] [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2026-11-26T17:14:29.391-03:00  INFO 17948 --- [money-trail-api] [           main] o.s.d.j.r.query.QueryEnhancerFactories   : Hibernate is in classpath; If applicable, HQL parser will be used.
2026-11-26T17:14:33.002-03:00  INFO 17948 --- [money-trail-api] [           main] o.s.b.t.m.w.SpringBootMockServletContext : Initializing Spring TestDispatcherServlet ''
2026-11-26T17:14:33.002-03:00  INFO 17948 --- [money-trail-api] [           main] o.s.t.web.servlet.TestDispatcherServlet  : Initializing Servlet ''
2026-11-26T17:14:33.015-03:00  INFO 17948 --- [money-trail-api] [           main] o.s.b.a.e.web.EndpointLinksResolver      : Exposing 2 endpoints beneath base path '/actuator'
2026-11-26T17:14:33.045-03:00  INFO 17948 --- [money-trail-api] [           main] o.s.t.web.servlet.TestDispatcherServlet  : Completed initialization in 42 ms
2026-11-26T17:14:33.269-03:00  INFO 17948 --- [money-trail-api] [           main] c.m.a.r.RevenueTypeAcceptanceTest        : Started RevenueTypeAcceptanceTest in 15.057 seconds (process running for 16.332)
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeAcceptanceTest#deleteRevenueType_returns404_whenIdMissin` - exit 0

```
	Maximum pool size: undefined/unknown
2026-11-26T17:14:54.899-03:00  INFO 24808 --- [money-trail-api] [           main] org.hibernate.orm.core                   : HHH000489: No JTA platform available (set 'hibernate.transaction.jta.platform' to enable JTA platform integration)
2026-11-26T17:14:55.006-03:00  INFO 24808 --- [money-trail-api] [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2026-11-26T17:14:55.702-03:00  INFO 24808 --- [money-trail-api] [           main] o.s.d.j.r.query.QueryEnhancerFactories   : Hibernate is in classpath; If applicable, HQL parser will be used.
2026-11-26T17:14:58.997-03:00  INFO 24808 --- [money-trail-api] [           main] o.s.b.t.m.w.SpringBootMockServletContext : Initializing Spring TestDispatcherServlet ''
2026-11-26T17:14:58.997-03:00  INFO 24808 --- [money-trail-api] [           main] o.s.t.web.servlet.TestDispatcherServlet  : Initializing Servlet ''
2026-11-26T17:14:59.032-03:00  INFO 24808 --- [money-trail-api] [           main] o.s.b.a.e.web.EndpointLinksResolver      : Exposing 2 endpoints beneath base path '/actuator'
2026-11-26T17:14:59.049-03:00  INFO 24808 --- [money-trail-api] [           main] o.s.t.web.servlet.TestDispatcherServlet  : Completed initialization in 52 ms
2026-11-26T17:14:59.246-03:00  INFO 24808 --- [money-trail-api] [           main] c.m.a.r.RevenueTypeAcceptanceTest        : Started RevenueTypeAcceptanceTest in 11.752 seconds (process running for 12.997)
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeAcceptanceTest#deleteASeededType_isAcceptedWithNoProtect` - exit 0

```
	Maximum pool size: undefined/unknown
2026-11-26T17:15:20.669-03:00  INFO 13368 --- [money-trail-api] [           main] org.hibernate.orm.core                   : HHH000489: No JTA platform available (set 'hibernate.transaction.jta.platform' to enable JTA platform integration)
2026-11-26T17:15:20.796-03:00  INFO 13368 --- [money-trail-api] [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2026-11-26T17:15:21.400-03:00  INFO 13368 --- [money-trail-api] [           main] o.s.d.j.r.query.QueryEnhancerFactories   : Hibernate is in classpath; If applicable, HQL parser will be used.
2026-11-26T17:15:24.455-03:00  INFO 13368 --- [money-trail-api] [           main] o.s.b.t.m.w.SpringBootMockServletContext : Initializing Spring TestDispatcherServlet ''
2026-11-26T17:15:24.455-03:00  INFO 13368 --- [money-trail-api] [           main] o.s.t.web.servlet.TestDispatcherServlet  : Initializing Servlet ''
2026-11-26T17:15:24.518-03:00  INFO 13368 --- [money-trail-api] [           main] o.s.b.a.e.web.EndpointLinksResolver      : Exposing 2 endpoints beneath base path '/actuator'
2026-11-26T17:15:24.574-03:00  INFO 13368 --- [money-trail-api] [           main] o.s.t.web.servlet.TestDispatcherServlet  : Completed initialization in 119 ms
2026-11-26T17:15:24.854-03:00  INFO 13368 --- [money-trail-api] [           main] c.m.a.r.RevenueTypeAcceptanceTest        : Started RevenueTypeAcceptanceTest in 11.58 seconds (process running for 12.833)
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
```
