package com.amazon.android.contentbrowser.app;


import com.amazon.android.contentbrowser.R;

import sqip.CardDetails;
import sqip.CardEntryActivityCommand;
import sqip.CardNonceBackgroundHandler;

import static com.amazon.android.contentbrowser.app.ContentBrowserApplication.app;

public class CardEntryBackgroundHandler implements CardNonceBackgroundHandler {


    // for sandbox - https://developer.squareup.com/docs/testing/test-values#successstates
    @Override
    public CardEntryActivityCommand handleEnteredCardInBackground(CardDetails cardDetails) {
        try {
            // TODO Call your backend service
//            MyBackendServiceResponse response = // myBackendService(cardDetails.getNonce());...

//            if (response.isSuccessful()) {
                return new CardEntryActivityCommand.Finish(); // currently assume success.
//            } else {
//                return new CardEntryActivityCommand.ShowError(response.errorMessage)
//            }
        } catch(Exception exception) {
            System.out.println(exception);
            return new CardEntryActivityCommand.ShowError(app.getResources().getString(R.string.network_failure));
        }
    }
}

