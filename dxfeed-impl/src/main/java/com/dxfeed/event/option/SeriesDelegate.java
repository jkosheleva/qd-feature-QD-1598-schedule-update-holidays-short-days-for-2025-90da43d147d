/*
 * !++
 * QDS - Quick Data Signalling Library
 * !-
 * Copyright (C) 2002 - 2021 Devexperts LLC
 * !-
 * This Source Code Form is subject to the terms of the Mozilla Public License, v. 2.0.
 * If a copy of the MPL was not distributed with this file, You can obtain one at
 * http://mozilla.org/MPL/2.0/.
 * !__
 */
package com.dxfeed.event.option;

import com.devexperts.qd.DataRecord;
import com.devexperts.qd.QDContract;
import com.devexperts.qd.ng.RecordBuffer;
import com.devexperts.qd.ng.RecordCursor;
import com.dxfeed.api.impl.EventDelegate;
import com.dxfeed.api.impl.EventDelegateFlags;
import com.dxfeed.event.option.impl.SeriesMapping;

import java.util.EnumSet;

public final class SeriesDelegate extends EventDelegate<Series> {
// BEGIN: CODE AUTOMATICALLY GENERATED: DO NOT MODIFY. IT IS REGENERATED BY com.dxfeed.api.codegen.ImplCodeGen
    private final SeriesMapping m;

    public SeriesDelegate(DataRecord record, QDContract contract, EnumSet<EventDelegateFlags> flags) {
        super(record, contract, flags);
        m = record.getMapping(SeriesMapping.class);
    }

    @Override
    public SeriesMapping getMapping() {
        return m;
    }

    @Override
    public Series createEvent() {
        return new Series();
    }

    @Override
    public Series getEvent(Series event, RecordCursor cursor) {
        super.getEvent(event, cursor);
        event.setEventFlags(cursor.getEventFlags());
        event.setIndex(((long) m.getIndex(cursor)));
        event.setTimeSequence((((long) m.getTimeSeconds(cursor)) << 32) | (m.getSequence(cursor) & 0xFFFFFFFFL));
        event.setExpiration(m.getExpiration(cursor));
        event.setVolatility(m.getVolatility(cursor));
        event.setCallVolume(m.getCallVolume(cursor));
        event.setPutVolume(m.getPutVolume(cursor));
        event.setPutCallRatio(m.getPutCallRatio(cursor));
        event.setForwardPrice(m.getForwardPrice(cursor));
        event.setDividend(m.getDividend(cursor));
        event.setInterest(m.getInterest(cursor));
        return event;
    }

    @Override
    public RecordCursor putEvent(Series event, RecordBuffer buf) {
        RecordCursor cursor = super.putEvent(event, buf);
        cursor.setEventFlags(event.getEventFlags());
        int index = (int) event.getIndex();
        m.setIndex(cursor, index);
        m.setTimeSeconds(cursor, (int) (event.getTimeSequence() >>> 32));
        m.setSequence(cursor, (int) event.getTimeSequence());
        m.setExpiration(cursor, event.getExpiration());
        m.setVolatility(cursor, event.getVolatility());
        m.setCallVolume(cursor, event.getCallVolume());
        m.setPutVolume(cursor, event.getPutVolume());
        m.setPutCallRatio(cursor, event.getPutCallRatio());
        m.setForwardPrice(cursor, event.getForwardPrice());
        m.setDividend(cursor, event.getDividend());
        m.setInterest(cursor, event.getInterest());
        return cursor;
    }
// END: CODE AUTOMATICALLY GENERATED
}
