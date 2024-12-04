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
package com.dxfeed.event.market.impl;

import com.devexperts.qd.DataRecord;
import com.devexperts.qd.ng.RecordCursor;
import com.devexperts.qd.util.MappingUtil;
import com.devexperts.util.TimeUtil;

public class TradeETHMapping extends MarketEventMapping {
// BEGIN: CODE AUTOMATICALLY GENERATED: DO NOT MODIFY. IT IS REGENERATED BY com.dxfeed.api.codegen.ImplCodeGen
    private final int iTime;
    private final int iSequence;
    private final int iTimeNanoPart;
    private final int iExchangeCode;
    private final int iPrice;
    private final int iSize;
    private final int iChange;
    private final int iDayId;
    private final int iDayVolume;
    private final int iDayTurnover;
    private final int iFlags;

    public TradeETHMapping(DataRecord record) {
        super(record);
        iTime = MappingUtil.findIntField(record, "ETHLast.Time", false);
        iSequence = MappingUtil.findIntField(record, "ETHLast.Sequence", false);
        iTimeNanoPart = MappingUtil.findIntField(record, "Last.TimeNanoPart", false);
        iExchangeCode = MappingUtil.findIntField(record, "ETHLast.Exchange", false);
        iPrice = findIntField("ETHLast.Price", true);
        iSize = findIntField("ETHLast.Size", true);
        iChange = findIntField("ETHLast.Change", false);
        iDayId = MappingUtil.findIntField(record, "DayId", false);
        iDayVolume = findIntField("ETHVolume", false);
        iDayTurnover = findIntField("ETHDayTurnover", false);
        iFlags = MappingUtil.findIntField(record, "ETHLast.Flags", true);
        putNonDefaultPropertyName("ETHLast.Time", "Time");
        putNonDefaultPropertyName("ETHLast.Sequence", "Sequence");
        putNonDefaultPropertyName("Last.TimeNanoPart", "TimeNanoPart");
        putNonDefaultPropertyName("ETHLast.Exchange", "ExchangeCode");
        putNonDefaultPropertyName("ETHLast.Price", "Price");
        putNonDefaultPropertyName("ETHLast.Size", "Size");
        putNonDefaultPropertyName("ETHLast.Change", "Change");
        putNonDefaultPropertyName("ETHVolume", "DayVolume");
        putNonDefaultPropertyName("ETHDayTurnover", "DayTurnover");
        putNonDefaultPropertyName("ETHLast.Flags", "Flags");
    }

    @Deprecated
    public long getETHLastTimeMillis(RecordCursor cursor) {
        if (iTime < 0)
            return 0;
        return getInt(cursor, iTime) * 1000L;
    }

    @Deprecated
    public void setETHLastTimeMillis(RecordCursor cursor, long _ETHLastTime) {
        if (iTime < 0)
            return;
        setInt(cursor, iTime, TimeUtil.getSecondsFromTime(_ETHLastTime));
    }

    @Deprecated
    public int getETHLastTimeSeconds(RecordCursor cursor) {
        if (iTime < 0)
            return 0;
        return getInt(cursor, iTime);
    }

    @Deprecated
    public void setETHLastTimeSeconds(RecordCursor cursor, int _ETHLastTime) {
        if (iTime < 0)
            return;
        setInt(cursor, iTime, _ETHLastTime);
    }

    public long getTimeMillis(RecordCursor cursor) {
        if (iTime < 0)
            return 0;
        return getInt(cursor, iTime) * 1000L;
    }

    public void setTimeMillis(RecordCursor cursor, long time) {
        if (iTime < 0)
            return;
        setInt(cursor, iTime, TimeUtil.getSecondsFromTime(time));
    }

    public int getTimeSeconds(RecordCursor cursor) {
        if (iTime < 0)
            return 0;
        return getInt(cursor, iTime);
    }

    public void setTimeSeconds(RecordCursor cursor, int time) {
        if (iTime < 0)
            return;
        setInt(cursor, iTime, time);
    }

    @Deprecated
    public int getETHLastSequence(RecordCursor cursor) {
        if (iSequence < 0)
            return 0;
        return getInt(cursor, iSequence);
    }

    @Deprecated
    public void setETHLastSequence(RecordCursor cursor, int _ETHLastSequence) {
        if (iSequence < 0)
            return;
        setInt(cursor, iSequence, _ETHLastSequence);
    }

    public int getSequence(RecordCursor cursor) {
        if (iSequence < 0)
            return 0;
        return getInt(cursor, iSequence);
    }

    public void setSequence(RecordCursor cursor, int sequence) {
        if (iSequence < 0)
            return;
        setInt(cursor, iSequence, sequence);
    }

    @Deprecated
    public int getLastTimeNanoPart(RecordCursor cursor) {
        if (iTimeNanoPart < 0)
            return 0;
        return getInt(cursor, iTimeNanoPart);
    }

    @Deprecated
    public void setLastTimeNanoPart(RecordCursor cursor, int lastTimeNanoPart) {
        if (iTimeNanoPart < 0)
            return;
        setInt(cursor, iTimeNanoPart, lastTimeNanoPart);
    }

    public int getTimeNanoPart(RecordCursor cursor) {
        if (iTimeNanoPart < 0)
            return 0;
        return getInt(cursor, iTimeNanoPart);
    }

    public void setTimeNanoPart(RecordCursor cursor, int timeNanoPart) {
        if (iTimeNanoPart < 0)
            return;
        setInt(cursor, iTimeNanoPart, timeNanoPart);
    }

    @Deprecated
    public char getETHLastExchange(RecordCursor cursor) {
        if (iExchangeCode < 0)
            return recordExchange;
        return (char) getInt(cursor, iExchangeCode);
    }

    @Deprecated
    public void setETHLastExchange(RecordCursor cursor, char _ETHLastExchange) {
        if (iExchangeCode < 0)
            return;
        setInt(cursor, iExchangeCode, _ETHLastExchange);
    }

    public char getExchangeCode(RecordCursor cursor) {
        if (iExchangeCode < 0)
            return recordExchange;
        return (char) getInt(cursor, iExchangeCode);
    }

    public void setExchangeCode(RecordCursor cursor, char exchangeCode) {
        if (iExchangeCode < 0)
            return;
        setInt(cursor, iExchangeCode, exchangeCode);
    }

    @Deprecated
    public double getETHLastPrice(RecordCursor cursor) {
        return getAsDouble(cursor, iPrice);
    }

    @Deprecated
    public void setETHLastPrice(RecordCursor cursor, double _ETHLastPrice) {
        setAsDouble(cursor, iPrice, _ETHLastPrice);
    }

    @Deprecated
    public int getETHLastPriceDecimal(RecordCursor cursor) {
        return getAsTinyDecimal(cursor, iPrice);
    }

    @Deprecated
    public void setETHLastPriceDecimal(RecordCursor cursor, int _ETHLastPrice) {
        setAsTinyDecimal(cursor, iPrice, _ETHLastPrice);
    }

    @Deprecated
    public long getETHLastPriceWideDecimal(RecordCursor cursor) {
        return getAsWideDecimal(cursor, iPrice);
    }

    @Deprecated
    public void setETHLastPriceWideDecimal(RecordCursor cursor, long _ETHLastPrice) {
        setAsWideDecimal(cursor, iPrice, _ETHLastPrice);
    }

    public double getPrice(RecordCursor cursor) {
        return getAsDouble(cursor, iPrice);
    }

    public void setPrice(RecordCursor cursor, double price) {
        setAsDouble(cursor, iPrice, price);
    }

    public int getPriceDecimal(RecordCursor cursor) {
        return getAsTinyDecimal(cursor, iPrice);
    }

    public void setPriceDecimal(RecordCursor cursor, int price) {
        setAsTinyDecimal(cursor, iPrice, price);
    }

    public long getPriceWideDecimal(RecordCursor cursor) {
        return getAsWideDecimal(cursor, iPrice);
    }

    public void setPriceWideDecimal(RecordCursor cursor, long price) {
        setAsWideDecimal(cursor, iPrice, price);
    }

    @Deprecated
    public int getETHLastSize(RecordCursor cursor) {
        return getAsInt(cursor, iSize);
    }

    @Deprecated
    public void setETHLastSize(RecordCursor cursor, int _ETHLastSize) {
        setAsInt(cursor, iSize, _ETHLastSize);
    }

    @Deprecated
    public long getETHLastSizeLong(RecordCursor cursor) {
        return getAsLong(cursor, iSize);
    }

    @Deprecated
    public void setETHLastSizeLong(RecordCursor cursor, long _ETHLastSize) {
        setAsLong(cursor, iSize, _ETHLastSize);
    }

    @Deprecated
    public double getETHLastSizeDouble(RecordCursor cursor) {
        return getAsDouble(cursor, iSize);
    }

    @Deprecated
    public void setETHLastSizeDouble(RecordCursor cursor, double _ETHLastSize) {
        setAsDouble(cursor, iSize, _ETHLastSize);
    }

    @Deprecated
    public int getETHLastSizeDecimal(RecordCursor cursor) {
        return getAsTinyDecimal(cursor, iSize);
    }

    @Deprecated
    public void setETHLastSizeDecimal(RecordCursor cursor, int _ETHLastSize) {
        setAsTinyDecimal(cursor, iSize, _ETHLastSize);
    }

    @Deprecated
    public long getETHLastSizeWideDecimal(RecordCursor cursor) {
        return getAsWideDecimal(cursor, iSize);
    }

    @Deprecated
    public void setETHLastSizeWideDecimal(RecordCursor cursor, long _ETHLastSize) {
        setAsWideDecimal(cursor, iSize, _ETHLastSize);
    }

    public int getSize(RecordCursor cursor) {
        return getAsInt(cursor, iSize);
    }

    public void setSize(RecordCursor cursor, int size) {
        setAsInt(cursor, iSize, size);
    }

    public long getSizeLong(RecordCursor cursor) {
        return getAsLong(cursor, iSize);
    }

    public void setSizeLong(RecordCursor cursor, long size) {
        setAsLong(cursor, iSize, size);
    }

    public double getSizeDouble(RecordCursor cursor) {
        return getAsDouble(cursor, iSize);
    }

    public void setSizeDouble(RecordCursor cursor, double size) {
        setAsDouble(cursor, iSize, size);
    }

    public int getSizeDecimal(RecordCursor cursor) {
        return getAsTinyDecimal(cursor, iSize);
    }

    public void setSizeDecimal(RecordCursor cursor, int size) {
        setAsTinyDecimal(cursor, iSize, size);
    }

    public long getSizeWideDecimal(RecordCursor cursor) {
        return getAsWideDecimal(cursor, iSize);
    }

    public void setSizeWideDecimal(RecordCursor cursor, long size) {
        setAsWideDecimal(cursor, iSize, size);
    }

    @Deprecated
    public double getETHLastChange(RecordCursor cursor) {
        if (iChange < 0)
            return Double.NaN;
        return getAsDouble(cursor, iChange);
    }

    @Deprecated
    public void setETHLastChange(RecordCursor cursor, double _ETHLastChange) {
        if (iChange < 0)
            return;
        setAsDouble(cursor, iChange, _ETHLastChange);
    }

    @Deprecated
    public int getETHLastChangeDecimal(RecordCursor cursor) {
        if (iChange < 0)
            return 0;
        return getAsTinyDecimal(cursor, iChange);
    }

    @Deprecated
    public void setETHLastChangeDecimal(RecordCursor cursor, int _ETHLastChange) {
        if (iChange < 0)
            return;
        setAsTinyDecimal(cursor, iChange, _ETHLastChange);
    }

    @Deprecated
    public long getETHLastChangeWideDecimal(RecordCursor cursor) {
        if (iChange < 0)
            return 0;
        return getAsWideDecimal(cursor, iChange);
    }

    @Deprecated
    public void setETHLastChangeWideDecimal(RecordCursor cursor, long _ETHLastChange) {
        if (iChange < 0)
            return;
        setAsWideDecimal(cursor, iChange, _ETHLastChange);
    }

    public double getChange(RecordCursor cursor) {
        if (iChange < 0)
            return Double.NaN;
        return getAsDouble(cursor, iChange);
    }

    public void setChange(RecordCursor cursor, double change) {
        if (iChange < 0)
            return;
        setAsDouble(cursor, iChange, change);
    }

    public int getChangeDecimal(RecordCursor cursor) {
        if (iChange < 0)
            return 0;
        return getAsTinyDecimal(cursor, iChange);
    }

    public void setChangeDecimal(RecordCursor cursor, int change) {
        if (iChange < 0)
            return;
        setAsTinyDecimal(cursor, iChange, change);
    }

    public long getChangeWideDecimal(RecordCursor cursor) {
        if (iChange < 0)
            return 0;
        return getAsWideDecimal(cursor, iChange);
    }

    public void setChangeWideDecimal(RecordCursor cursor, long change) {
        if (iChange < 0)
            return;
        setAsWideDecimal(cursor, iChange, change);
    }

    public int getDayId(RecordCursor cursor) {
        if (iDayId < 0)
            return 0;
        return getInt(cursor, iDayId);
    }

    public void setDayId(RecordCursor cursor, int dayId) {
        if (iDayId < 0)
            return;
        setInt(cursor, iDayId, dayId);
    }

    @Deprecated
    public long getETHVolume(RecordCursor cursor) {
        if (iDayVolume < 0)
            return 0;
        return getAsLong(cursor, iDayVolume);
    }

    @Deprecated
    public void setETHVolume(RecordCursor cursor, long _ETHVolume) {
        if (iDayVolume < 0)
            return;
        setAsLong(cursor, iDayVolume, _ETHVolume);
    }

    @Deprecated
    public double getETHVolumeDouble(RecordCursor cursor) {
        if (iDayVolume < 0)
            return Double.NaN;
        return getAsDouble(cursor, iDayVolume);
    }

    @Deprecated
    public void setETHVolumeDouble(RecordCursor cursor, double _ETHVolume) {
        if (iDayVolume < 0)
            return;
        setAsDouble(cursor, iDayVolume, _ETHVolume);
    }

    @Deprecated
    public int getETHVolumeDecimal(RecordCursor cursor) {
        if (iDayVolume < 0)
            return 0;
        return getAsTinyDecimal(cursor, iDayVolume);
    }

    @Deprecated
    public void setETHVolumeDecimal(RecordCursor cursor, int _ETHVolume) {
        if (iDayVolume < 0)
            return;
        setAsTinyDecimal(cursor, iDayVolume, _ETHVolume);
    }

    @Deprecated
    public long getETHVolumeWideDecimal(RecordCursor cursor) {
        if (iDayVolume < 0)
            return 0;
        return getAsWideDecimal(cursor, iDayVolume);
    }

    @Deprecated
    public void setETHVolumeWideDecimal(RecordCursor cursor, long _ETHVolume) {
        if (iDayVolume < 0)
            return;
        setAsWideDecimal(cursor, iDayVolume, _ETHVolume);
    }

    public long getDayVolume(RecordCursor cursor) {
        if (iDayVolume < 0)
            return 0;
        return getAsLong(cursor, iDayVolume);
    }

    public void setDayVolume(RecordCursor cursor, long dayVolume) {
        if (iDayVolume < 0)
            return;
        setAsLong(cursor, iDayVolume, dayVolume);
    }

    public double getDayVolumeDouble(RecordCursor cursor) {
        if (iDayVolume < 0)
            return Double.NaN;
        return getAsDouble(cursor, iDayVolume);
    }

    public void setDayVolumeDouble(RecordCursor cursor, double dayVolume) {
        if (iDayVolume < 0)
            return;
        setAsDouble(cursor, iDayVolume, dayVolume);
    }

    public int getDayVolumeDecimal(RecordCursor cursor) {
        if (iDayVolume < 0)
            return 0;
        return getAsTinyDecimal(cursor, iDayVolume);
    }

    public void setDayVolumeDecimal(RecordCursor cursor, int dayVolume) {
        if (iDayVolume < 0)
            return;
        setAsTinyDecimal(cursor, iDayVolume, dayVolume);
    }

    public long getDayVolumeWideDecimal(RecordCursor cursor) {
        if (iDayVolume < 0)
            return 0;
        return getAsWideDecimal(cursor, iDayVolume);
    }

    public void setDayVolumeWideDecimal(RecordCursor cursor, long dayVolume) {
        if (iDayVolume < 0)
            return;
        setAsWideDecimal(cursor, iDayVolume, dayVolume);
    }

    @Deprecated
    public double getETHDayTurnover(RecordCursor cursor) {
        if (iDayTurnover < 0)
            return Double.NaN;
        return getAsDouble(cursor, iDayTurnover);
    }

    @Deprecated
    public void setETHDayTurnover(RecordCursor cursor, double _ETHDayTurnover) {
        if (iDayTurnover < 0)
            return;
        setAsDouble(cursor, iDayTurnover, _ETHDayTurnover);
    }

    @Deprecated
    public int getETHDayTurnoverDecimal(RecordCursor cursor) {
        if (iDayTurnover < 0)
            return 0;
        return getAsTinyDecimal(cursor, iDayTurnover);
    }

    @Deprecated
    public void setETHDayTurnoverDecimal(RecordCursor cursor, int _ETHDayTurnover) {
        if (iDayTurnover < 0)
            return;
        setAsTinyDecimal(cursor, iDayTurnover, _ETHDayTurnover);
    }

    @Deprecated
    public long getETHDayTurnoverWideDecimal(RecordCursor cursor) {
        if (iDayTurnover < 0)
            return 0;
        return getAsWideDecimal(cursor, iDayTurnover);
    }

    @Deprecated
    public void setETHDayTurnoverWideDecimal(RecordCursor cursor, long _ETHDayTurnover) {
        if (iDayTurnover < 0)
            return;
        setAsWideDecimal(cursor, iDayTurnover, _ETHDayTurnover);
    }

    public double getDayTurnover(RecordCursor cursor) {
        if (iDayTurnover < 0)
            return Double.NaN;
        return getAsDouble(cursor, iDayTurnover);
    }

    public void setDayTurnover(RecordCursor cursor, double dayTurnover) {
        if (iDayTurnover < 0)
            return;
        setAsDouble(cursor, iDayTurnover, dayTurnover);
    }

    public int getDayTurnoverDecimal(RecordCursor cursor) {
        if (iDayTurnover < 0)
            return 0;
        return getAsTinyDecimal(cursor, iDayTurnover);
    }

    public void setDayTurnoverDecimal(RecordCursor cursor, int dayTurnover) {
        if (iDayTurnover < 0)
            return;
        setAsTinyDecimal(cursor, iDayTurnover, dayTurnover);
    }

    public long getDayTurnoverWideDecimal(RecordCursor cursor) {
        if (iDayTurnover < 0)
            return 0;
        return getAsWideDecimal(cursor, iDayTurnover);
    }

    public void setDayTurnoverWideDecimal(RecordCursor cursor, long dayTurnover) {
        if (iDayTurnover < 0)
            return;
        setAsWideDecimal(cursor, iDayTurnover, dayTurnover);
    }

    @Deprecated
    public int getETHLastFlags(RecordCursor cursor) {
        return getInt(cursor, iFlags);
    }

    @Deprecated
    public void setETHLastFlags(RecordCursor cursor, int _ETHLastFlags) {
        setInt(cursor, iFlags, _ETHLastFlags);
    }

    public int getFlags(RecordCursor cursor) {
        return getInt(cursor, iFlags);
    }

    public void setFlags(RecordCursor cursor, int flags) {
        setInt(cursor, iFlags, flags);
    }
// END: CODE AUTOMATICALLY GENERATED
}
