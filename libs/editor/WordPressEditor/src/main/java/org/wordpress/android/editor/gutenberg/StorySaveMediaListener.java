package org.wordpress.android.editor.gutenberg;

public interface StorySaveMediaListener {
    void onMediaSaveReattached(String localId, float currentProgress);
    void onMediaSaveSucceeded(String localId, String mediaUrl);
    void onMediaSaveProgress(String localId, float progress);
    void onMediaSaveFailed(String localId);
}
