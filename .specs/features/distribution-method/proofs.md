# distribution-method proofs

**HEAD**: 5a995b7
**Tree**: dirty - .agents/
**Shell**: C:/Program Files/Git\bin\bash.exe
**Result**: 23 pass, 0 fail

| Check | Proof | Result |
| --- | --- | --- |
| C1 | `./mvnw -q test -DfailIfNoTests=true -Dtest=DistributionMethodServiceTest#create_savesAndReturnsMethod_whenVali` | pass |
| C2 | `./mvnw -q test -DfailIfNoTests=true -Dtest=DistributionMethodServiceTest#create_throwsInvalid_whenPercentagesD` | pass |
| C3 | `./mvnw -q test -DfailIfNoTests=true -Dtest=DistributionMethodServiceTest#create_throwsDuplicate_whenTitleExist` | pass |
| C4 | `./mvnw -q test -DfailIfNoTests=true -Dtest=DistributionMethodServiceTest#findAll_returnsAllOrderedByCreatedAtA` | pass |
| C5 | `./mvnw -q test -DfailIfNoTests=true -Dtest=DistributionMethodServiceTest#findById_returnsMethod_whenExists` | pass |
| C6 | `./mvnw -q test -DfailIfNoTests=true -Dtest=DistributionMethodServiceTest#findById_throwsNotFound_whenIdMissing` | pass |
| C7 | `./mvnw -q test -DfailIfNoTests=true -Dtest=DistributionMethodServiceTest#update_savesChangesAndReturnsMethod_w` | pass |
| C8 | `./mvnw -q test -DfailIfNoTests=true -Dtest=DistributionMethodServiceTest#update_throwsNotFound_whenIdMissing` | pass |
| C9 | `./mvnw -q test -DfailIfNoTests=true -Dtest=DistributionMethodServiceTest#update_throwsDuplicate_whenTitleUsedB` | pass |
| C10 | `./mvnw -q test -DfailIfNoTests=true -Dtest=DistributionMethodServiceTest#update_allowsSameMethodKeepingItsOwnT` | pass |
| C11 | `./mvnw -q test -DfailIfNoTests=true -Dtest=DistributionMethodServiceTest#update_throwsInvalid_whenPercentagesD` | pass |
| C12 | `./mvnw -q test -DfailIfNoTests=true -Dtest=DistributionMethodServiceTest#delete_removesMethod_whenExists` | pass |
| C13 | `./mvnw -q test -DfailIfNoTests=true -Dtest=DistributionMethodServiceTest#delete_throwsNotFound_whenIdMissing` | pass |
| C14 | `./mvnw -q test -DfailIfNoTests=true -Dtest=DistributionMethodControllerTest#createMethod_returns201WithLocatio` | pass |
| C15 | `./mvnw -q test -DfailIfNoTests=true -Dtest=DistributionMethodControllerTest#createMethod_returns400_whenTitleB` | pass |
| C16 | `./mvnw -q test -DfailIfNoTests=true -Dtest=DistributionMethodControllerTest#createMethod_returns400_whenPercen` | pass |
| C17 | `./mvnw -q test -DfailIfNoTests=true -Dtest=DistributionMethodControllerTest#createMethod_returns400_whenServic` | pass |
| C18 | `./mvnw -q test -DfailIfNoTests=true -Dtest=DistributionMethodControllerTest#createMethod_returns409_whenServic` | pass |
| C19 | `./mvnw -q test -DfailIfNoTests=true -Dtest=DistributionMethodControllerTest#listMethods_returns200WithEmptyArr` | pass |
| C20 | `./mvnw -q test -DfailIfNoTests=true -Dtest=DistributionMethodControllerTest#getMethod_returns404_whenServiceTh` | pass |
| C21 | `./mvnw -q test -DfailIfNoTests=true -Dtest=DistributionMethodControllerTest#updateMethod_returns200WithUpdated` | pass |
| C22 | `./mvnw -q test -DfailIfNoTests=true -Dtest=DistributionMethodControllerTest#deleteMethod_returns204_whenServic` | pass |
| Build | `./mvnw -B verify` | pass |

## Output

`./mvnw -q test -DfailIfNoTests=true -Dtest=DistributionMethodServiceTest#create_savesAndReturnsMethod_whenVali` - exit 0

```
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=DistributionMethodServiceTest#create_throwsInvalid_whenPercentagesD` - exit 0

```
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=DistributionMethodServiceTest#create_throwsDuplicate_whenTitleExist` - exit 0

```
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=DistributionMethodServiceTest#findAll_returnsAllOrderedByCreatedAtA` - exit 0

```
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=DistributionMethodServiceTest#findById_returnsMethod_whenExists` - exit 0

```
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=DistributionMethodServiceTest#findById_throwsNotFound_whenIdMissing` - exit 0

```
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=DistributionMethodServiceTest#update_savesChangesAndReturnsMethod_w` - exit 0

```
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=DistributionMethodServiceTest#update_throwsNotFound_whenIdMissing` - exit 0

```
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=DistributionMethodServiceTest#update_throwsDuplicate_whenTitleUsedB` - exit 0

```
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=DistributionMethodServiceTest#update_allowsSameMethodKeepingItsOwnT` - exit 0

```
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=DistributionMethodServiceTest#update_throwsInvalid_whenPercentagesD` - exit 0

```
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=DistributionMethodServiceTest#delete_removesMethod_whenExists` - exit 0

```
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=DistributionMethodServiceTest#delete_throwsNotFound_whenIdMissing` - exit 0

```
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=DistributionMethodControllerTest#createMethod_returns201WithLocatio` - exit 0

```
14:29:32.177 [main] INFO org.hibernate.validator.internal.util.Version -- HV000001: Hibernate Validator 9.1.6.Final
14:29:32.474 [main] INFO org.springframework.mock.web.MockServletContext -- Initializing Spring TestDispatcherServlet ''
14:29:32.476 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet -- Initializing Servlet ''
14:29:32.479 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet -- Completed initialization in 2 ms
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=DistributionMethodControllerTest#createMethod_returns400_whenTitleB` - exit 0

```
14:29:42.088 [main] INFO org.hibernate.validator.internal.util.Version -- HV000001: Hibernate Validator 9.1.6.Final
14:29:42.394 [main] INFO org.springframework.mock.web.MockServletContext -- Initializing Spring TestDispatcherServlet ''
14:29:42.396 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet -- Initializing Servlet ''
14:29:42.400 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet -- Completed initialization in 2 ms
14:29:42.686 [main] WARN org.springframework.web.servlet.mvc.support.DefaultHandlerExceptionResolver -- Resolved [org.springframework.web.bind.MethodArgumentNotValidException: Validation failed for argument [0] in public org.springframework.http.ResponseEntity<com.moneytrail.api.distributionmethod.dto.DistributionMethodResponse> com.moneytrail.api.distributionmethod.DistributionMethodController.create(com.moneytrail.api.distributionmethod.dto.DistributionMethodRequest): [Field error in object 'distributionMethodRequest' on field 'title': rejected value [ ]; codes [NotBlank.distributionMethodRequest.title,NotBlank.title,NotBlank.java.lang.String,NotBlank]; arguments [org.springframework.context.support.DefaultMessageSourceResolvable: codes [distributionMethodRequest.title,title]; arguments []; default message [title]]; default message [must not be blank]] ]
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=DistributionMethodControllerTest#createMethod_returns400_whenPercen` - exit 0

```
14:29:51.353 [main] INFO org.hibernate.validator.internal.util.Version -- HV000001: Hibernate Validator 9.1.6.Final
14:29:51.631 [main] INFO org.springframework.mock.web.MockServletContext -- Initializing Spring TestDispatcherServlet ''
14:29:51.633 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet -- Initializing Servlet ''
14:29:51.636 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet -- Completed initialization in 2 ms
14:29:51.893 [main] WARN org.springframework.web.servlet.mvc.support.DefaultHandlerExceptionResolver -- Resolved [org.springframework.web.bind.MethodArgumentNotValidException: Validation failed for argument [0] in public org.springframework.http.ResponseEntity<com.moneytrail.api.distributionmethod.dto.DistributionMethodResponse> com.moneytrail.api.distributionmethod.DistributionMethodController.create(com.moneytrail.api.distributionmethod.dto.DistributionMethodRequest): [Field error in object 'distributionMethodRequest' on field 'spendPercentage': rejected value [101]; codes [Max.distributionMethodRequest.spendPercentage,Max.spendPercentage,Max.java.lang.Integer,Max]; arguments [org.springframework.context.support.DefaultMessageSourceResolvable: codes [distributionMethodRequest.spendPercentage,spendPercentage]; arguments []; default message [spendPercentage],100]; default message [must be less than or equal to 100]] ]
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=DistributionMethodControllerTest#createMethod_returns400_whenServic` - exit 0

```
14:30:00.721 [main] INFO org.hibernate.validator.internal.util.Version -- HV000001: Hibernate Validator 9.1.6.Final
14:30:00.985 [main] INFO org.springframework.mock.web.MockServletContext -- Initializing Spring TestDispatcherServlet ''
14:30:00.986 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet -- Initializing Servlet ''
14:30:00.990 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet -- Completed initialization in 3 ms
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=DistributionMethodControllerTest#createMethod_returns409_whenServic` - exit 0

```
14:30:10.082 [main] INFO org.hibernate.validator.internal.util.Version -- HV000001: Hibernate Validator 9.1.6.Final
14:30:10.350 [main] INFO org.springframework.mock.web.MockServletContext -- Initializing Spring TestDispatcherServlet ''
14:30:10.352 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet -- Initializing Servlet ''
14:30:10.356 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet -- Completed initialization in 3 ms
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=DistributionMethodControllerTest#listMethods_returns200WithEmptyArr` - exit 0

```
14:30:19.175 [main] INFO org.hibernate.validator.internal.util.Version -- HV000001: Hibernate Validator 9.1.6.Final
14:30:19.484 [main] INFO org.springframework.mock.web.MockServletContext -- Initializing Spring TestDispatcherServlet ''
14:30:19.486 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet -- Initializing Servlet ''
14:30:19.490 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet -- Completed initialization in 3 ms
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=DistributionMethodControllerTest#getMethod_returns404_whenServiceTh` - exit 0

```
14:30:27.946 [main] INFO org.hibernate.validator.internal.util.Version -- HV000001: Hibernate Validator 9.1.6.Final
14:30:28.226 [main] INFO org.springframework.mock.web.MockServletContext -- Initializing Spring TestDispatcherServlet ''
14:30:28.228 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet -- Initializing Servlet ''
14:30:28.232 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet -- Completed initialization in 3 ms
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=DistributionMethodControllerTest#updateMethod_returns200WithUpdated` - exit 0

```
14:30:36.342 [main] INFO org.hibernate.validator.internal.util.Version -- HV000001: Hibernate Validator 9.1.6.Final
14:30:36.630 [main] INFO org.springframework.mock.web.MockServletContext -- Initializing Spring TestDispatcherServlet ''
14:30:36.631 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet -- Initializing Servlet ''
14:30:36.636 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet -- Completed initialization in 2 ms
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=DistributionMethodControllerTest#deleteMethod_returns204_whenServic` - exit 0

```
14:30:45.818 [main] INFO org.hibernate.validator.internal.util.Version -- HV000001: Hibernate Validator 9.1.6.Final
14:30:46.116 [main] INFO org.springframework.mock.web.MockServletContext -- Initializing Spring TestDispatcherServlet ''
14:30:46.118 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet -- Initializing Servlet ''
14:30:46.122 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet -- Completed initialization in 3 ms
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
```
