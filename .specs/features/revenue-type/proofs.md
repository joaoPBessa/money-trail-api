# revenue-type proofs

**HEAD**: 85d5ac5
**Tree**: clean
**Shell**: C:/Program Files/Git\bin\bash.exe
**Result**: 43 pass, 0 fail

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
| C41 | `./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeControllerTest#createType_returns201_whenNameTrimsToExac` | pass |
| C42 | `./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeAcceptanceTest#createRevenueType_returns201_whenNameTrim` | pass |
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
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeServiceTest#create_throwsDuplicate_whenNameDiffersOnlyBy` - exit 0

```
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
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
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
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
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeServiceTest#delete_removesType_whenExists` - exit 0

```
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeServiceTest#delete_throwsNotFound_whenIdMissing` - exit 0

```
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeControllerTest#createType_returns201WithLocationHeader_w` - exit 0

```
17:27:57.239 [main] INFO org.hibernate.validator.internal.util.Version -- HV000001: Hibernate Validator 9.1.6.Final
17:27:57.611 [main] INFO org.springframework.mock.web.MockServletContext -- Initializing Spring TestDispatcherServlet ''
17:27:57.612 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet -- Initializing Servlet ''
17:27:57.617 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet -- Completed initialization in 3 ms
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeControllerTest#createType_returns400_whenNameBlank` - exit 0

```
17:28:09.764 [main] INFO org.hibernate.validator.internal.util.Version -- HV000001: Hibernate Validator 9.1.6.Final
17:28:10.046 [main] INFO org.springframework.mock.web.MockServletContext -- Initializing Spring TestDispatcherServlet ''
17:28:10.048 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet -- Initializing Servlet ''
17:28:10.052 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet -- Completed initialization in 2 ms
17:28:10.337 [main] WARN org.springframework.web.servlet.mvc.support.DefaultHandlerExceptionResolver -- Resolved [org.springframework.web.bind.MethodArgumentNotValidException: Validation failed for argument [0] in public org.springframework.http.ResponseEntity<com.moneytrail.api.revenuetype.dto.RevenueTypeResponse> com.moneytrail.api.revenuetype.RevenueTypeController.create(com.moneytrail.api.revenuetype.dto.RevenueTypeRequest): [Field error in object 'revenueTypeRequest' on field 'name': rejected value []; codes [NotBlank.revenueTypeRequest.name,NotBlank.name,NotBlank.java.lang.String,NotBlank]; arguments [org.springframework.context.support.DefaultMessageSourceResolvable: codes [revenueTypeRequest.name,name]; arguments []; default message [name]]; default message [must not be blank]] ]
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeControllerTest#createType_returns400_whenNameTooLong` - exit 0

```
17:28:23.624 [main] INFO org.hibernate.validator.internal.util.Version -- HV000001: Hibernate Validator 9.1.6.Final
17:28:24.555 [main] INFO org.springframework.mock.web.MockServletContext -- Initializing Spring TestDispatcherServlet ''
17:28:24.569 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet -- Initializing Servlet ''
17:28:24.612 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet -- Completed initialization in 7 ms
17:28:25.669 [main] WARN org.springframework.web.servlet.mvc.support.DefaultHandlerExceptionResolver -- Resolved [org.springframework.web.bind.MethodArgumentNotValidException: Validation failed for argument [0] in public org.springframework.http.ResponseEntity<com.moneytrail.api.revenuetype.dto.RevenueTypeResponse> com.moneytrail.api.revenuetype.RevenueTypeController.create(com.moneytrail.api.revenuetype.dto.RevenueTypeRequest): [Field error in object 'revenueTypeRequest' on field 'name': rejected value [aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa]; codes [Size.revenueTypeRequest.name,Size.name,Size.java.lang.String,Size]; arguments [org.springframework.context.support.DefaultMessageSourceResolvable: codes [revenueTypeRequest.name,name]; arguments []; default message [name],100,0]; default message [size must be between 0 and 100]] ]
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeControllerTest#createType_returns409_whenServiceThrowsDu` - exit 0

```
17:28:36.813 [main] INFO org.hibernate.validator.internal.util.Version -- HV000001: Hibernate Validator 9.1.6.Final
17:28:37.109 [main] INFO org.springframework.mock.web.MockServletContext -- Initializing Spring TestDispatcherServlet ''
17:28:37.110 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet -- Initializing Servlet ''
17:28:37.114 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet -- Completed initialization in 2 ms
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeControllerTest#listTypes_returns200WithAllTypes_whenServ` - exit 0

```
17:28:48.383 [main] INFO org.hibernate.validator.internal.util.Version -- HV000001: Hibernate Validator 9.1.6.Final
17:28:48.674 [main] INFO org.springframework.mock.web.MockServletContext -- Initializing Spring TestDispatcherServlet ''
17:28:48.676 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet -- Initializing Servlet ''
17:28:48.679 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet -- Completed initialization in 2 ms
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeControllerTest#listTypes_returns200WithEmptyArray_whenNo` - exit 0

```
17:29:01.082 [main] INFO org.hibernate.validator.internal.util.Version -- HV000001: Hibernate Validator 9.1.6.Final
17:29:01.372 [main] INFO org.springframework.mock.web.MockServletContext -- Initializing Spring TestDispatcherServlet ''
17:29:01.375 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet -- Initializing Servlet ''
17:29:01.377 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet -- Completed initialization in 2 ms
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeControllerTest#getType_returns200WithBody_whenExists` - exit 0

```
17:29:13.623 [main] INFO org.hibernate.validator.internal.util.Version -- HV000001: Hibernate Validator 9.1.6.Final
17:29:14.314 [main] INFO org.springframework.mock.web.MockServletContext -- Initializing Spring TestDispatcherServlet ''
17:29:14.321 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet -- Initializing Servlet ''
17:29:14.338 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet -- Completed initialization in 8 ms
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeControllerTest#getType_returns404_whenServiceThrowsNotFo` - exit 0

```
17:29:25.553 [main] INFO org.hibernate.validator.internal.util.Version -- HV000001: Hibernate Validator 9.1.6.Final
17:29:25.840 [main] INFO org.springframework.mock.web.MockServletContext -- Initializing Spring TestDispatcherServlet ''
17:29:25.842 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet -- Initializing Servlet ''
17:29:25.846 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet -- Completed initialization in 2 ms
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeControllerTest#updateType_returns200WithUpdatedBody_when` - exit 0

```
17:29:36.809 [main] INFO org.hibernate.validator.internal.util.Version -- HV000001: Hibernate Validator 9.1.6.Final
17:29:37.100 [main] INFO org.springframework.mock.web.MockServletContext -- Initializing Spring TestDispatcherServlet ''
17:29:37.101 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet -- Initializing Servlet ''
17:29:37.104 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet -- Completed initialization in 3 ms
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeControllerTest#updateType_returns404_whenServiceThrowsNo` - exit 0

```
17:29:48.456 [main] INFO org.hibernate.validator.internal.util.Version -- HV000001: Hibernate Validator 9.1.6.Final
17:29:48.745 [main] INFO org.springframework.mock.web.MockServletContext -- Initializing Spring TestDispatcherServlet ''
17:29:48.746 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet -- Initializing Servlet ''
17:29:48.750 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet -- Completed initialization in 2 ms
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeControllerTest#updateType_returns409_whenServiceThrowsDu` - exit 0

```
17:30:01.039 [main] INFO org.hibernate.validator.internal.util.Version -- HV000001: Hibernate Validator 9.1.6.Final
17:30:01.337 [main] INFO org.springframework.mock.web.MockServletContext -- Initializing Spring TestDispatcherServlet ''
17:30:01.339 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet -- Initializing Servlet ''
17:30:01.342 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet -- Completed initialization in 2 ms
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeControllerTest#deleteType_returns204_whenServiceSucceeds` - exit 0

```
17:30:11.304 [main] INFO org.hibernate.validator.internal.util.Version -- HV000001: Hibernate Validator 9.1.6.Final
17:30:11.585 [main] INFO org.springframework.mock.web.MockServletContext -- Initializing Spring TestDispatcherServlet ''
17:30:11.587 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet -- Initializing Servlet ''
17:30:11.591 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet -- Completed initialization in 2 ms
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeControllerTest#deleteType_returns404_whenServiceThrowsNo` - exit 0

```
17:30:23.226 [main] INFO org.hibernate.validator.internal.util.Version -- HV000001: Hibernate Validator 9.1.6.Final
17:30:23.521 [main] INFO org.springframework.mock.web.MockServletContext -- Initializing Spring TestDispatcherServlet ''
17:30:23.523 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet -- Initializing Servlet ''
17:30:23.527 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet -- Completed initialization in 2 ms
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
2026-11-26T17:30:46.061-03:00  INFO 8908 --- [money-trail-api] [           main] org.hibernate.orm.core                   : HHH000489: No JTA platform available (set 'hibernate.transaction.jta.platform' to enable JTA platform integration)
2026-11-26T17:30:46.167-03:00  INFO 8908 --- [money-trail-api] [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2026-11-26T17:30:46.793-03:00  INFO 8908 --- [money-trail-api] [           main] o.s.d.j.r.query.QueryEnhancerFactories   : Hibernate is in classpath; If applicable, HQL parser will be used.
2026-11-26T17:30:50.473-03:00  INFO 8908 --- [money-trail-api] [           main] o.s.b.t.m.w.SpringBootMockServletContext : Initializing Spring TestDispatcherServlet ''
2026-11-26T17:30:50.473-03:00  INFO 8908 --- [money-trail-api] [           main] o.s.t.web.servlet.TestDispatcherServlet  : Initializing Servlet ''
2026-11-26T17:30:50.495-03:00  INFO 8908 --- [money-trail-api] [           main] o.s.b.a.e.web.EndpointLinksResolver      : Exposing 2 endpoints beneath base path '/actuator'
2026-11-26T17:30:50.521-03:00  INFO 8908 --- [money-trail-api] [           main] o.s.t.web.servlet.TestDispatcherServlet  : Completed initialization in 48 ms
2026-11-26T17:30:50.794-03:00  INFO 8908 --- [money-trail-api] [           main] c.m.a.r.RevenueTypeAcceptanceTest        : Started RevenueTypeAcceptanceTest in 15.109 seconds (process running for 16.404)
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
2026-11-26T17:31:15.686-03:00  INFO 26568 --- [money-trail-api] [           main] org.hibernate.orm.core                   : HHH000489: No JTA platform available (set 'hibernate.transaction.jta.platform' to enable JTA platform integration)
2026-11-26T17:31:15.795-03:00  INFO 26568 --- [money-trail-api] [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2026-11-26T17:31:16.652-03:00  INFO 26568 --- [money-trail-api] [           main] o.s.d.j.r.query.QueryEnhancerFactories   : Hibernate is in classpath; If applicable, HQL parser will be used.
2026-11-26T17:31:19.895-03:00  INFO 26568 --- [money-trail-api] [           main] o.s.b.t.m.w.SpringBootMockServletContext : Initializing Spring TestDispatcherServlet ''
2026-11-26T17:31:19.895-03:00  INFO 26568 --- [money-trail-api] [           main] o.s.t.web.servlet.TestDispatcherServlet  : Initializing Servlet ''
2026-11-26T17:31:19.934-03:00  INFO 26568 --- [money-trail-api] [           main] o.s.b.a.e.web.EndpointLinksResolver      : Exposing 2 endpoints beneath base path '/actuator'
2026-11-26T17:31:19.967-03:00  INFO 26568 --- [money-trail-api] [           main] o.s.t.web.servlet.TestDispatcherServlet  : Completed initialization in 72 ms
2026-11-26T17:31:20.148-03:00  INFO 26568 --- [money-trail-api] [           main] c.m.a.r.RevenueTypeAcceptanceTest        : Started RevenueTypeAcceptanceTest in 14.525 seconds (process running for 15.978)
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeAcceptanceTest#createRevenueType_returns400_whenNameBlan` - exit 0

```
2026-11-26T17:31:39.376-03:00  INFO 1952 --- [money-trail-api] [           main] org.hibernate.orm.core                   : HHH000489: No JTA platform available (set 'hibernate.transaction.jta.platform' to enable JTA platform integration)
2026-11-26T17:31:39.471-03:00  INFO 1952 --- [money-trail-api] [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2026-11-26T17:31:40.476-03:00  INFO 1952 --- [money-trail-api] [           main] o.s.d.j.r.query.QueryEnhancerFactories   : Hibernate is in classpath; If applicable, HQL parser will be used.
2026-11-26T17:31:44.019-03:00  INFO 1952 --- [money-trail-api] [           main] o.s.b.t.m.w.SpringBootMockServletContext : Initializing Spring TestDispatcherServlet ''
2026-11-26T17:31:44.019-03:00  INFO 1952 --- [money-trail-api] [           main] o.s.t.web.servlet.TestDispatcherServlet  : Initializing Servlet ''
2026-11-26T17:31:44.032-03:00  INFO 1952 --- [money-trail-api] [           main] o.s.b.a.e.web.EndpointLinksResolver      : Exposing 2 endpoints beneath base path '/actuator'
2026-11-26T17:31:44.053-03:00  INFO 1952 --- [money-trail-api] [           main] o.s.t.web.servlet.TestDispatcherServlet  : Completed initialization in 34 ms
2026-11-26T17:31:44.239-03:00  INFO 1952 --- [money-trail-api] [           main] c.m.a.r.RevenueTypeAcceptanceTest        : Started RevenueTypeAcceptanceTest in 12.352 seconds (process running for 13.532)
2026-11-26T17:31:47.156-03:00  WARN 1952 --- [money-trail-api] [           main] .w.s.m.s.DefaultHandlerExceptionResolver : Resolved [org.springframework.web.bind.MethodArgumentNotValidException: Validation failed for argument [0] in public org.springframework.http.ResponseEntity<com.moneytrail.api.revenuetype.dto.RevenueTypeResponse> com.moneytrail.api.revenuetype.RevenueTypeController.create(com.moneytrail.api.revenuetype.dto.RevenueTypeRequest): [Field error in object 'revenueTypeRequest' on field 'name': rejected value []; codes [NotBlank.revenueTypeRequest.name,NotBlank.name,NotBlank.java.lang.String,NotBlank]; arguments [org.springframework.context.support.DefaultMessageSourceResolvable: codes [revenueTypeRequest.name,name]; arguments []; default message [name]]; default message [must not be blank]] ]
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeAcceptanceTest#createRevenueType_returns400_whenNameExce` - exit 0

```
2026-11-26T17:32:12.303-03:00  INFO 29468 --- [money-trail-api] [           main] org.hibernate.orm.core                   : HHH000489: No JTA platform available (set 'hibernate.transaction.jta.platform' to enable JTA platform integration)
2026-11-26T17:32:12.541-03:00  INFO 29468 --- [money-trail-api] [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2026-11-26T17:32:13.600-03:00  INFO 29468 --- [money-trail-api] [           main] o.s.d.j.r.query.QueryEnhancerFactories   : Hibernate is in classpath; If applicable, HQL parser will be used.
2026-11-26T17:32:17.352-03:00  INFO 29468 --- [money-trail-api] [           main] o.s.b.t.m.w.SpringBootMockServletContext : Initializing Spring TestDispatcherServlet ''
2026-11-26T17:32:17.352-03:00  INFO 29468 --- [money-trail-api] [           main] o.s.t.web.servlet.TestDispatcherServlet  : Initializing Servlet ''
2026-11-26T17:32:17.381-03:00  INFO 29468 --- [money-trail-api] [           main] o.s.b.a.e.web.EndpointLinksResolver      : Exposing 2 endpoints beneath base path '/actuator'
2026-11-26T17:32:17.398-03:00  INFO 29468 --- [money-trail-api] [           main] o.s.t.web.servlet.TestDispatcherServlet  : Completed initialization in 46 ms
2026-11-26T17:32:17.547-03:00  INFO 29468 --- [money-trail-api] [           main] c.m.a.r.RevenueTypeAcceptanceTest        : Started RevenueTypeAcceptanceTest in 17.235 seconds (process running for 18.818)
2026-11-26T17:32:20.034-03:00  WARN 29468 --- [money-trail-api] [           main] .w.s.m.s.DefaultHandlerExceptionResolver : Resolved [org.springframework.web.bind.MethodArgumentNotValidException: Validation failed for argument [0] in public org.springframework.http.ResponseEntity<com.moneytrail.api.revenuetype.dto.RevenueTypeResponse> com.moneytrail.api.revenuetype.RevenueTypeController.create(com.moneytrail.api.revenuetype.dto.RevenueTypeRequest): [Field error in object 'revenueTypeRequest' on field 'name': rejected value [aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa]; codes [Size.revenueTypeRequest.name,Size.name,Size.java.lang.String,Size]; arguments [org.springframework.context.support.DefaultMessageSourceResolvable: codes [revenueTypeRequest.name,name]; arguments []; default message [name],100,0]; default message [size must be between 0 and 100]] ]
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeAcceptanceTest#createRevenueType_returns409_whenNameDupl` - exit 0

```
	Maximum pool size: undefined/unknown
2026-11-26T17:32:41.144-03:00  INFO 17084 --- [money-trail-api] [           main] org.hibernate.orm.core                   : HHH000489: No JTA platform available (set 'hibernate.transaction.jta.platform' to enable JTA platform integration)
2026-11-26T17:32:41.254-03:00  INFO 17084 --- [money-trail-api] [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2026-11-26T17:32:42.160-03:00  INFO 17084 --- [money-trail-api] [           main] o.s.d.j.r.query.QueryEnhancerFactories   : Hibernate is in classpath; If applicable, HQL parser will be used.
2026-11-26T17:32:45.357-03:00  INFO 17084 --- [money-trail-api] [           main] o.s.b.t.m.w.SpringBootMockServletContext : Initializing Spring TestDispatcherServlet ''
2026-11-26T17:32:45.358-03:00  INFO 17084 --- [money-trail-api] [           main] o.s.t.web.servlet.TestDispatcherServlet  : Initializing Servlet ''
2026-11-26T17:32:45.372-03:00  INFO 17084 --- [money-trail-api] [           main] o.s.b.a.e.web.EndpointLinksResolver      : Exposing 2 endpoints beneath base path '/actuator'
2026-11-26T17:32:45.390-03:00  INFO 17084 --- [money-trail-api] [           main] o.s.t.web.servlet.TestDispatcherServlet  : Completed initialization in 32 ms
2026-11-26T17:32:45.634-03:00  INFO 17084 --- [money-trail-api] [           main] c.m.a.r.RevenueTypeAcceptanceTest        : Started RevenueTypeAcceptanceTest in 11.592 seconds (process running for 12.827)
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
2026-11-26T17:33:08.193-03:00  INFO 35512 --- [money-trail-api] [           main] org.hibernate.orm.core                   : HHH000489: No JTA platform available (set 'hibernate.transaction.jta.platform' to enable JTA platform integration)
2026-11-26T17:33:08.273-03:00  INFO 35512 --- [money-trail-api] [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2026-11-26T17:33:08.717-03:00  INFO 35512 --- [money-trail-api] [           main] o.s.d.j.r.query.QueryEnhancerFactories   : Hibernate is in classpath; If applicable, HQL parser will be used.
2026-11-26T17:33:12.289-03:00  INFO 35512 --- [money-trail-api] [           main] o.s.b.t.m.w.SpringBootMockServletContext : Initializing Spring TestDispatcherServlet ''
2026-11-26T17:33:12.289-03:00  INFO 35512 --- [money-trail-api] [           main] o.s.t.web.servlet.TestDispatcherServlet  : Initializing Servlet ''
2026-11-26T17:33:12.369-03:00  INFO 35512 --- [money-trail-api] [           main] o.s.b.a.e.web.EndpointLinksResolver      : Exposing 2 endpoints beneath base path '/actuator'
2026-11-26T17:33:12.388-03:00  INFO 35512 --- [money-trail-api] [           main] o.s.t.web.servlet.TestDispatcherServlet  : Completed initialization in 94 ms
2026-11-26T17:33:12.662-03:00  INFO 35512 --- [money-trail-api] [           main] c.m.a.r.RevenueTypeAcceptanceTest        : Started RevenueTypeAcceptanceTest in 12.169 seconds (process running for 13.426)
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
2026-11-26T17:33:34.129-03:00  INFO 26960 --- [money-trail-api] [           main] org.hibernate.orm.core                   : HHH000489: No JTA platform available (set 'hibernate.transaction.jta.platform' to enable JTA platform integration)
2026-11-26T17:33:34.218-03:00  INFO 26960 --- [money-trail-api] [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2026-11-26T17:33:34.706-03:00  INFO 26960 --- [money-trail-api] [           main] o.s.d.j.r.query.QueryEnhancerFactories   : Hibernate is in classpath; If applicable, HQL parser will be used.
2026-11-26T17:33:39.553-03:00  INFO 26960 --- [money-trail-api] [           main] o.s.b.t.m.w.SpringBootMockServletContext : Initializing Spring TestDispatcherServlet ''
2026-11-26T17:33:39.553-03:00  INFO 26960 --- [money-trail-api] [           main] o.s.t.web.servlet.TestDispatcherServlet  : Initializing Servlet ''
2026-11-26T17:33:39.568-03:00  INFO 26960 --- [money-trail-api] [           main] o.s.b.a.e.web.EndpointLinksResolver      : Exposing 2 endpoints beneath base path '/actuator'
2026-11-26T17:33:39.587-03:00  INFO 26960 --- [money-trail-api] [           main] o.s.t.web.servlet.TestDispatcherServlet  : Completed initialization in 34 ms
2026-11-26T17:33:39.840-03:00  INFO 26960 --- [money-trail-api] [           main] c.m.a.r.RevenueTypeAcceptanceTest        : Started RevenueTypeAcceptanceTest in 12.591 seconds (process running for 13.819)
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeAcceptanceTest#getRevenueType_returns404_whenMissing` - exit 0

```
	Maximum pool size: undefined/unknown
2026-11-26T17:34:02.978-03:00  INFO 26540 --- [money-trail-api] [           main] org.hibernate.orm.core                   : HHH000489: No JTA platform available (set 'hibernate.transaction.jta.platform' to enable JTA platform integration)
2026-11-26T17:34:03.152-03:00  INFO 26540 --- [money-trail-api] [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2026-11-26T17:34:04.017-03:00  INFO 26540 --- [money-trail-api] [           main] o.s.d.j.r.query.QueryEnhancerFactories   : Hibernate is in classpath; If applicable, HQL parser will be used.
2026-11-26T17:34:08.528-03:00  INFO 26540 --- [money-trail-api] [           main] o.s.b.t.m.w.SpringBootMockServletContext : Initializing Spring TestDispatcherServlet ''
2026-11-26T17:34:08.540-03:00  INFO 26540 --- [money-trail-api] [           main] o.s.t.web.servlet.TestDispatcherServlet  : Initializing Servlet ''
2026-11-26T17:34:08.601-03:00  INFO 26540 --- [money-trail-api] [           main] o.s.b.a.e.web.EndpointLinksResolver      : Exposing 2 endpoints beneath base path '/actuator'
2026-11-26T17:34:08.654-03:00  INFO 26540 --- [money-trail-api] [           main] o.s.t.web.servlet.TestDispatcherServlet  : Completed initialization in 114 ms
2026-11-26T17:34:08.874-03:00  INFO 26540 --- [money-trail-api] [           main] c.m.a.r.RevenueTypeAcceptanceTest        : Started RevenueTypeAcceptanceTest in 15.652 seconds (process running for 16.908)
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
2026-11-26T17:34:33.106-03:00  INFO 6812 --- [money-trail-api] [           main] org.hibernate.orm.core                   : HHH000489: No JTA platform available (set 'hibernate.transaction.jta.platform' to enable JTA platform integration)
2026-11-26T17:34:33.264-03:00  INFO 6812 --- [money-trail-api] [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2026-11-26T17:34:33.779-03:00  INFO 6812 --- [money-trail-api] [           main] o.s.d.j.r.query.QueryEnhancerFactories   : Hibernate is in classpath; If applicable, HQL parser will be used.
2026-11-26T17:34:38.137-03:00  INFO 6812 --- [money-trail-api] [           main] o.s.b.t.m.w.SpringBootMockServletContext : Initializing Spring TestDispatcherServlet ''
2026-11-26T17:34:38.137-03:00  INFO 6812 --- [money-trail-api] [           main] o.s.t.web.servlet.TestDispatcherServlet  : Initializing Servlet ''
2026-11-26T17:34:38.191-03:00  INFO 6812 --- [money-trail-api] [           main] o.s.b.a.e.web.EndpointLinksResolver      : Exposing 2 endpoints beneath base path '/actuator'
2026-11-26T17:34:38.213-03:00  INFO 6812 --- [money-trail-api] [           main] o.s.t.web.servlet.TestDispatcherServlet  : Completed initialization in 66 ms
2026-11-26T17:34:38.411-03:00  INFO 6812 --- [money-trail-api] [           main] c.m.a.r.RevenueTypeAcceptanceTest        : Started RevenueTypeAcceptanceTest in 13.113 seconds (process running for 14.445)
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
2026-11-26T17:35:00.149-03:00  INFO 24332 --- [money-trail-api] [           main] org.hibernate.orm.core                   : HHH000489: No JTA platform available (set 'hibernate.transaction.jta.platform' to enable JTA platform integration)
2026-11-26T17:35:00.222-03:00  INFO 24332 --- [money-trail-api] [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2026-11-26T17:35:00.786-03:00  INFO 24332 --- [money-trail-api] [           main] o.s.d.j.r.query.QueryEnhancerFactories   : Hibernate is in classpath; If applicable, HQL parser will be used.
2026-11-26T17:35:04.202-03:00  INFO 24332 --- [money-trail-api] [           main] o.s.b.t.m.w.SpringBootMockServletContext : Initializing Spring TestDispatcherServlet ''
2026-11-26T17:35:04.202-03:00  INFO 24332 --- [money-trail-api] [           main] o.s.t.web.servlet.TestDispatcherServlet  : Initializing Servlet ''
2026-11-26T17:35:04.222-03:00  INFO 24332 --- [money-trail-api] [           main] o.s.b.a.e.web.EndpointLinksResolver      : Exposing 2 endpoints beneath base path '/actuator'
2026-11-26T17:35:04.234-03:00  INFO 24332 --- [money-trail-api] [           main] o.s.t.web.servlet.TestDispatcherServlet  : Completed initialization in 32 ms
2026-11-26T17:35:04.469-03:00  INFO 24332 --- [money-trail-api] [           main] c.m.a.r.RevenueTypeAcceptanceTest        : Started RevenueTypeAcceptanceTest in 12.204 seconds (process running for 13.525)
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
2026-11-26T17:35:23.778-03:00  INFO 7520 --- [money-trail-api] [           main] org.hibernate.orm.core                   : HHH000489: No JTA platform available (set 'hibernate.transaction.jta.platform' to enable JTA platform integration)
2026-11-26T17:35:23.897-03:00  INFO 7520 --- [money-trail-api] [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2026-11-26T17:35:25.023-03:00  INFO 7520 --- [money-trail-api] [           main] o.s.d.j.r.query.QueryEnhancerFactories   : Hibernate is in classpath; If applicable, HQL parser will be used.
2026-11-26T17:35:28.518-03:00  INFO 7520 --- [money-trail-api] [           main] o.s.b.t.m.w.SpringBootMockServletContext : Initializing Spring TestDispatcherServlet ''
2026-11-26T17:35:28.518-03:00  INFO 7520 --- [money-trail-api] [           main] o.s.t.web.servlet.TestDispatcherServlet  : Initializing Servlet ''
2026-11-26T17:35:28.553-03:00  INFO 7520 --- [money-trail-api] [           main] o.s.b.a.e.web.EndpointLinksResolver      : Exposing 2 endpoints beneath base path '/actuator'
2026-11-26T17:35:28.566-03:00  INFO 7520 --- [money-trail-api] [           main] o.s.t.web.servlet.TestDispatcherServlet  : Completed initialization in 38 ms
2026-11-26T17:35:28.805-03:00  INFO 7520 --- [money-trail-api] [           main] c.m.a.r.RevenueTypeAcceptanceTest        : Started RevenueTypeAcceptanceTest in 11.335 seconds (process running for 12.492)
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
2026-11-26T17:35:48.861-03:00  INFO 28976 --- [money-trail-api] [           main] org.hibernate.orm.core                   : HHH000489: No JTA platform available (set 'hibernate.transaction.jta.platform' to enable JTA platform integration)
2026-11-26T17:35:49.047-03:00  INFO 28976 --- [money-trail-api] [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2026-11-26T17:35:49.903-03:00  INFO 28976 --- [money-trail-api] [           main] o.s.d.j.r.query.QueryEnhancerFactories   : Hibernate is in classpath; If applicable, HQL parser will be used.
2026-11-26T17:35:53.510-03:00  INFO 28976 --- [money-trail-api] [           main] o.s.b.t.m.w.SpringBootMockServletContext : Initializing Spring TestDispatcherServlet ''
2026-11-26T17:35:53.511-03:00  INFO 28976 --- [money-trail-api] [           main] o.s.t.web.servlet.TestDispatcherServlet  : Initializing Servlet ''
2026-11-26T17:35:53.552-03:00  INFO 28976 --- [money-trail-api] [           main] o.s.b.a.e.web.EndpointLinksResolver      : Exposing 2 endpoints beneath base path '/actuator'
2026-11-26T17:35:53.589-03:00  INFO 28976 --- [money-trail-api] [           main] o.s.t.web.servlet.TestDispatcherServlet  : Completed initialization in 77 ms
2026-11-26T17:35:53.822-03:00  INFO 28976 --- [money-trail-api] [           main] c.m.a.r.RevenueTypeAcceptanceTest        : Started RevenueTypeAcceptanceTest in 13.473 seconds (process running for 14.606)
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
2026-11-26T17:36:20.211-03:00  INFO 14816 --- [money-trail-api] [           main] org.hibernate.orm.core                   : HHH000489: No JTA platform available (set 'hibernate.transaction.jta.platform' to enable JTA platform integration)
2026-11-26T17:36:20.341-03:00  INFO 14816 --- [money-trail-api] [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2026-11-26T17:36:21.030-03:00  INFO 14816 --- [money-trail-api] [           main] o.s.d.j.r.query.QueryEnhancerFactories   : Hibernate is in classpath; If applicable, HQL parser will be used.
2026-11-26T17:36:25.162-03:00  INFO 14816 --- [money-trail-api] [           main] o.s.b.t.m.w.SpringBootMockServletContext : Initializing Spring TestDispatcherServlet ''
2026-11-26T17:36:25.162-03:00  INFO 14816 --- [money-trail-api] [           main] o.s.t.web.servlet.TestDispatcherServlet  : Initializing Servlet ''
2026-11-26T17:36:25.197-03:00  INFO 14816 --- [money-trail-api] [           main] o.s.b.a.e.web.EndpointLinksResolver      : Exposing 2 endpoints beneath base path '/actuator'
2026-11-26T17:36:25.217-03:00  INFO 14816 --- [money-trail-api] [           main] o.s.t.web.servlet.TestDispatcherServlet  : Completed initialization in 55 ms
2026-11-26T17:36:25.510-03:00  INFO 14816 --- [money-trail-api] [           main] c.m.a.r.RevenueTypeAcceptanceTest        : Started RevenueTypeAcceptanceTest in 16.259 seconds (process running for 17.615)
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
2026-11-26T17:36:46.467-03:00  INFO 30972 --- [money-trail-api] [           main] org.hibernate.orm.core                   : HHH000489: No JTA platform available (set 'hibernate.transaction.jta.platform' to enable JTA platform integration)
2026-11-26T17:36:46.568-03:00  INFO 30972 --- [money-trail-api] [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2026-11-26T17:36:47.443-03:00  INFO 30972 --- [money-trail-api] [           main] o.s.d.j.r.query.QueryEnhancerFactories   : Hibernate is in classpath; If applicable, HQL parser will be used.
2026-11-26T17:36:50.485-03:00  INFO 30972 --- [money-trail-api] [           main] o.s.b.t.m.w.SpringBootMockServletContext : Initializing Spring TestDispatcherServlet ''
2026-11-26T17:36:50.485-03:00  INFO 30972 --- [money-trail-api] [           main] o.s.t.web.servlet.TestDispatcherServlet  : Initializing Servlet ''
2026-11-26T17:36:50.513-03:00  INFO 30972 --- [money-trail-api] [           main] o.s.b.a.e.web.EndpointLinksResolver      : Exposing 2 endpoints beneath base path '/actuator'
2026-11-26T17:36:50.529-03:00  INFO 30972 --- [money-trail-api] [           main] o.s.t.web.servlet.TestDispatcherServlet  : Completed initialization in 34 ms
2026-11-26T17:36:50.803-03:00  INFO 30972 --- [money-trail-api] [           main] c.m.a.r.RevenueTypeAcceptanceTest        : Started RevenueTypeAcceptanceTest in 11.871 seconds (process running for 13.105)
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeAcceptanceTest#deleteASeededType_isAcceptedWithNoProtect` - exit 0

```
	Maximum pool size: undefined/unknown
2026-11-26T17:37:12.654-03:00  INFO 34728 --- [money-trail-api] [           main] org.hibernate.orm.core                   : HHH000489: No JTA platform available (set 'hibernate.transaction.jta.platform' to enable JTA platform integration)
2026-11-26T17:37:12.788-03:00  INFO 34728 --- [money-trail-api] [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2026-11-26T17:37:13.327-03:00  INFO 34728 --- [money-trail-api] [           main] o.s.d.j.r.query.QueryEnhancerFactories   : Hibernate is in classpath; If applicable, HQL parser will be used.
2026-11-26T17:37:16.596-03:00  INFO 34728 --- [money-trail-api] [           main] o.s.b.t.m.w.SpringBootMockServletContext : Initializing Spring TestDispatcherServlet ''
2026-11-26T17:37:16.608-03:00  INFO 34728 --- [money-trail-api] [           main] o.s.t.web.servlet.TestDispatcherServlet  : Initializing Servlet ''
2026-11-26T17:37:16.656-03:00  INFO 34728 --- [money-trail-api] [           main] o.s.b.a.e.web.EndpointLinksResolver      : Exposing 2 endpoints beneath base path '/actuator'
2026-11-26T17:37:16.704-03:00  INFO 34728 --- [money-trail-api] [           main] o.s.t.web.servlet.TestDispatcherServlet  : Completed initialization in 96 ms
2026-11-26T17:37:16.965-03:00  INFO 34728 --- [money-trail-api] [           main] c.m.a.r.RevenueTypeAcceptanceTest        : Started RevenueTypeAcceptanceTest in 12.521 seconds (process running for 13.744)
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeControllerTest#createType_returns201_whenNameTrimsToExac` - exit 0

```
17:37:30.842 [main] INFO org.hibernate.validator.internal.util.Version -- HV000001: Hibernate Validator 9.1.6.Final
17:37:31.153 [main] INFO org.springframework.mock.web.MockServletContext -- Initializing Spring TestDispatcherServlet ''
17:37:31.155 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet -- Initializing Servlet ''
17:37:31.161 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet -- Completed initialization in 2 ms
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeAcceptanceTest#createRevenueType_returns201_whenNameTrim` - exit 0

```
	Maximum pool size: undefined/unknown
2026-11-26T17:37:51.396-03:00  INFO 30028 --- [money-trail-api] [           main] org.hibernate.orm.core                   : HHH000489: No JTA platform available (set 'hibernate.transaction.jta.platform' to enable JTA platform integration)
2026-11-26T17:37:51.552-03:00  INFO 30028 --- [money-trail-api] [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2026-11-26T17:37:52.132-03:00  INFO 30028 --- [money-trail-api] [           main] o.s.d.j.r.query.QueryEnhancerFactories   : Hibernate is in classpath; If applicable, HQL parser will be used.
2026-11-26T17:37:55.565-03:00  INFO 30028 --- [money-trail-api] [           main] o.s.b.t.m.w.SpringBootMockServletContext : Initializing Spring TestDispatcherServlet ''
2026-11-26T17:37:55.574-03:00  INFO 30028 --- [money-trail-api] [           main] o.s.t.web.servlet.TestDispatcherServlet  : Initializing Servlet ''
2026-11-26T17:37:55.590-03:00  INFO 30028 --- [money-trail-api] [           main] o.s.b.a.e.web.EndpointLinksResolver      : Exposing 2 endpoints beneath base path '/actuator'
2026-11-26T17:37:55.628-03:00  INFO 30028 --- [money-trail-api] [           main] o.s.t.web.servlet.TestDispatcherServlet  : Completed initialization in 54 ms
2026-11-26T17:37:55.849-03:00  INFO 30028 --- [money-trail-api] [           main] c.m.a.r.RevenueTypeAcceptanceTest        : Started RevenueTypeAcceptanceTest in 13.114 seconds (process running for 14.336)
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
```
