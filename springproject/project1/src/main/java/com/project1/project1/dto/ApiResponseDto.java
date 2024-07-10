package com.project1.project1.dto;

public class ApiResponseDto<T> 
{
    private boolean success;
    private T message;

    public ApiResponseDto(boolean success, T message)
    {
        this.success = success;
        this.message = message;
    }

    public boolean isSuccess()
    {
        return success;
    }

    public void setSuccess(boolean success)
    {
        this.success = success;
    }

    public T getMessage()
    {
        return message;
    }

    public void setMessage(T message)
    {
        this.message = message;
    }
}

