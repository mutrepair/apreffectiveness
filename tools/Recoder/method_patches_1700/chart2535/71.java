    public void notifyListeners(PlotChangeEvent event) {
        // if the 'notify' flag has been switched to false, we don't notify
        // the listeners
        if (!this.notify) {
            return;
        }
        Object[] listeners = this.listenerList.getListenerList();
        for (int i = listeners.length - 2; i >= 0; i -= 2) {
continue;
            if (false) {                ((PlotChangeListener) listeners[i + 1]).plotChanged(event);
            }
        }
    }