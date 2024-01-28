/*
 * NamSor API v2
 * NamSor API v2 : enpoints to process personal names (gender, cultural origin or ethnicity) in all alphabets or languages. By default, enpoints use 1 unit per name (ex. Gender), but Ethnicity classification uses 10 to 20 units per name depending on taxonomy. Use GET methods for small tests, but prefer POST methods for higher throughput (batch processing of up to 100 names at a time). Need something you can't find here? We have many more features coming soon. Let us know, we'll do our best to add it! 
 *
 * The version of the OpenAPI document: 2.0.29
 * Contact: contact@namsor.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.namsor.sdk2.api;

import com.namsor.sdk2.invoke.ApiException;
import com.namsor.sdk2.model.APIClassifierTaxonomyOut;
import com.namsor.sdk2.model.APIClassifiersStatusOut;
import com.namsor.sdk2.model.APIKeyOut;
import com.namsor.sdk2.model.APIPeriodUsageOut;
import com.namsor.sdk2.model.APIServicesOut;
import com.namsor.sdk2.model.APIUsageAggregatedOut;
import com.namsor.sdk2.model.APIUsageHistoryOut;
import com.namsor.sdk2.model.RegionOut;
import com.namsor.sdk2.model.SoftwareVersionOut;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AdminApi
 */
@Disabled
public class AdminApiTest {

    private final AdminApi api = new AdminApi();

    /**
     * Activate/deactivate anonymization for a source.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void anonymizeTest() throws ApiException {
        String source = null;
        Boolean anonymized = null;
        api.anonymize(source, anonymized);
        // TODO: test validations
    }

    /**
     * Activate/deactivate anonymization for a source.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void anonymize1Test() throws ApiException {
        String source = null;
        Boolean anonymized = null;
        String token = null;
        APIKeyOut response = api.anonymize1(source, anonymized, token);
        // TODO: test validations
    }

    /**
     * Read API Key info.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiKeyInfoTest() throws ApiException {
        APIKeyOut response = api.apiKeyInfo();
        // TODO: test validations
    }

    /**
     * Prints the current status of the classifiers. A classifier name in apiStatus corresponds to a service name in apiServices.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiStatusTest() throws ApiException {
        APIClassifiersStatusOut response = api.apiStatus();
        // TODO: test validations
    }

    /**
     * Print current API usage.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiUsageTest() throws ApiException {
        APIPeriodUsageOut response = api.apiUsage();
        // TODO: test validations
    }

    /**
     * Print historical API usage.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiUsageHistoryTest() throws ApiException {
        APIUsageHistoryOut response = api.apiUsageHistory();
        // TODO: test validations
    }

    /**
     * Print historical API usage (in an aggregated view, by service, by day/hour/min).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiUsageHistoryAggregateTest() throws ApiException {
        APIUsageAggregatedOut response = api.apiUsageHistoryAggregate();
        // TODO: test validations
    }

    /**
     * List of classification services and usage cost in Units per classification (default is 1&#x3D;ONE Unit). Some API endpoints (ex. Corridor) combine multiple classifiers.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void availableServicesTest() throws ApiException {
        APIServicesOut response = api.availableServices();
        // TODO: test validations
    }

    /**
     * Activate/deactivate an API Key.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void disableTest() throws ApiException {
        String source = null;
        Boolean disabled = null;
        api.disable(source, disabled);
        // TODO: test validations
    }

    /**
     * Activate/deactivate learning from a source.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void learnableTest() throws ApiException {
        String source = null;
        Boolean learnable = null;
        String token = null;
        APIKeyOut response = api.learnable(source, learnable, token);
        // TODO: test validations
    }

    /**
     * Activate/deactivate learning from a source.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void learnable1Test() throws ApiException {
        String source = null;
        Boolean learnable = null;
        api.learnable1(source, learnable);
        // TODO: test validations
    }

    /**
     * Print basic source statistics.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void regionsTest() throws ApiException {
        RegionOut response = api.regions();
        // TODO: test validations
    }

    /**
     * Get the current software version
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void softwareVersionTest() throws ApiException {
        SoftwareVersionOut response = api.softwareVersion();
        // TODO: test validations
    }

    /**
     * Print the taxonomy classes valid for the given classifier.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void taxonomyClassesTest() throws ApiException {
        String classifierName = null;
        APIClassifierTaxonomyOut response = api.taxonomyClasses(classifierName);
        // TODO: test validations
    }

}
