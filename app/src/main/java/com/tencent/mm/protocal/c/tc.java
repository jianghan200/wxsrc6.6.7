package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class tc
  extends com.tencent.mm.bk.a
{
  public int hcE;
  public String jTu;
  public String rco;
  public int rdV;
  public int rdW;
  public String rwt;
  public bhy rwu;
  public String rwv;
  public String rww;
  public String rwx;
  public int rwy;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rwu == null) {
        throw new b("Not all required fields were included: EmojiBuffer");
      }
      if (this.rwt != null) {
        paramVarArgs.g(1, this.rwt);
      }
      paramVarArgs.fT(2, this.rdW);
      paramVarArgs.fT(3, this.rdV);
      if (this.rwu != null)
      {
        paramVarArgs.fV(4, this.rwu.boi());
        this.rwu.a(paramVarArgs);
      }
      paramVarArgs.fT(5, this.hcE);
      if (this.jTu != null) {
        paramVarArgs.g(6, this.jTu);
      }
      if (this.rwv != null) {
        paramVarArgs.g(7, this.rwv);
      }
      if (this.rww != null) {
        paramVarArgs.g(8, this.rww);
      }
      if (this.rwx != null) {
        paramVarArgs.g(9, this.rwx);
      }
      if (this.rco != null) {
        paramVarArgs.g(10, this.rco);
      }
      paramVarArgs.fT(11, this.rwy);
      return 0;
    }
    if (paramInt == 1) {
      if (this.rwt == null) {
        break label799;
      }
    }
    label799:
    for (paramInt = f.a.a.b.b.a.h(1, this.rwt) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.rdW) + f.a.a.a.fQ(3, this.rdV);
      paramInt = i;
      if (this.rwu != null) {
        paramInt = i + f.a.a.a.fS(4, this.rwu.boi());
      }
      i = paramInt + f.a.a.a.fQ(5, this.hcE);
      paramInt = i;
      if (this.jTu != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.jTu);
      }
      i = paramInt;
      if (this.rwv != null) {
        i = paramInt + f.a.a.b.b.a.h(7, this.rwv);
      }
      paramInt = i;
      if (this.rww != null) {
        paramInt = i + f.a.a.b.b.a.h(8, this.rww);
      }
      i = paramInt;
      if (this.rwx != null) {
        i = paramInt + f.a.a.b.b.a.h(9, this.rwx);
      }
      paramInt = i;
      if (this.rco != null) {
        paramInt = i + f.a.a.b.b.a.h(10, this.rco);
      }
      return paramInt + f.a.a.a.fQ(11, this.rwy);
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.rwu != null) {
          break;
        }
        throw new b("Not all required fields were included: EmojiBuffer");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        tc localtc = (tc)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          localtc.rwt = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 2: 
          localtc.rdW = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          localtc.rdV = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 4: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            Object localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhy();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localtc.rwu = ((bhy)localObject1);
            paramInt += 1;
          }
        case 5: 
          localtc.hcE = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 6: 
          localtc.jTu = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 7: 
          localtc.rwv = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 8: 
          localtc.rww = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 9: 
          localtc.rwx = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 10: 
          localtc.rco = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localtc.rwy = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/protocal/c/tc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */