package com.ankki.cfcmms.model;

public class DataBoard {
    private Integer boardId;

    private Integer dbConfigId;

    private String dataBoardName;

    private String dataBoardValue;

    private Long dataBoardTime;

    public Integer getBoardId() {
        return boardId;
    }

    public void setBoardId(Integer boardId) {
        this.boardId = boardId;
    }

    public Integer getDbConfigId() {
        return dbConfigId;
    }

    public void setDbConfigId(Integer dbConfigId) {
        this.dbConfigId = dbConfigId;
    }

    public String getDataBoardName() {
        return dataBoardName;
    }

    public void setDataBoardName(String dataBoardName) {
        this.dataBoardName = dataBoardName == null ? null : dataBoardName.trim();
    }

    public String getDataBoardValue() {
        return dataBoardValue;
    }

    public void setDataBoardValue(String dataBoardValue) {
        this.dataBoardValue = dataBoardValue == null ? null : dataBoardValue.trim();
    }

    public Long getDataBoardTime() {
        return dataBoardTime;
    }

    public void setDataBoardTime(Long dataBoardTime) {
        this.dataBoardTime = dataBoardTime;
    }
}