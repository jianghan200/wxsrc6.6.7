package com.tencent.mm.plugin.collect.b;

import f.a.a.b;

public class t
  extends com.tencent.mm.bk.a
{
  public String bJg;
  public String bOe;
  public String daA;
  public double hUL;
  public String hUM;
  public int msgType;
  public int scene;
  public int status;
  public int timestamp;
  public String type;
  public String username;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.username == null) {
        throw new b("Not all required fields were included: username");
      }
      if (this.bOe == null) {
        throw new b("Not all required fields were included: transactionId");
      }
      if (this.bJg == null) {
        throw new b("Not all required fields were included: feeType");
      }
      if (this.username != null) {
        paramVarArgs.g(1, this.username);
      }
      if (this.bOe != null) {
        paramVarArgs.g(2, this.bOe);
      }
      paramVarArgs.c(3, this.hUL);
      if (this.bJg != null) {
        paramVarArgs.g(4, this.bJg);
      }
      paramVarArgs.fT(5, this.timestamp);
      paramVarArgs.fT(6, this.scene);
      paramVarArgs.fT(7, this.status);
      if (this.daA != null) {
        paramVarArgs.g(8, this.daA);
      }
      if (this.hUM != null) {
        paramVarArgs.g(9, this.hUM);
      }
      paramVarArgs.fT(10, this.msgType);
      if (this.type != null) {
        paramVarArgs.g(11, this.type);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.username == null) {
        break label757;
      }
    }
    label757:
    for (paramInt = f.a.a.b.b.a.h(1, this.username) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.bOe != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.bOe);
      }
      i += f.a.a.b.b.a.ec(3) + 8;
      paramInt = i;
      if (this.bJg != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.bJg);
      }
      i = paramInt + f.a.a.a.fQ(5, this.timestamp) + f.a.a.a.fQ(6, this.scene) + f.a.a.a.fQ(7, this.status);
      paramInt = i;
      if (this.daA != null) {
        paramInt = i + f.a.a.b.b.a.h(8, this.daA);
      }
      i = paramInt;
      if (this.hUM != null) {
        i = paramInt + f.a.a.b.b.a.h(9, this.hUM);
      }
      i += f.a.a.a.fQ(10, this.msgType);
      paramInt = i;
      if (this.type != null) {
        paramInt = i + f.a.a.b.b.a.h(11, this.type);
      }
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.username == null) {
          throw new b("Not all required fields were included: username");
        }
        if (this.bOe == null) {
          throw new b("Not all required fields were included: transactionId");
        }
        if (this.bJg != null) {
          break;
        }
        throw new b("Not all required fields were included: feeType");
      }
      if (paramInt == 3)
      {
        f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
        t localt = (t)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localt.username = locala.vHC.readString();
          return 0;
        case 2: 
          localt.bOe = locala.vHC.readString();
          return 0;
        case 3: 
          localt.hUL = locala.vHC.readDouble();
          return 0;
        case 4: 
          localt.bJg = locala.vHC.readString();
          return 0;
        case 5: 
          localt.timestamp = locala.vHC.rY();
          return 0;
        case 6: 
          localt.scene = locala.vHC.rY();
          return 0;
        case 7: 
          localt.status = locala.vHC.rY();
          return 0;
        case 8: 
          localt.daA = locala.vHC.readString();
          return 0;
        case 9: 
          localt.hUM = locala.vHC.readString();
          return 0;
        case 10: 
          localt.msgType = locala.vHC.rY();
          return 0;
        }
        localt.type = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/collect/b/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */