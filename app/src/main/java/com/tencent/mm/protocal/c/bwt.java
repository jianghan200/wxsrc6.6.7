package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class bwt
  extends bhd
{
  public String jTu;
  public String jTv;
  public int otY;
  public String rsZ;
  public bhy rtW;
  public byo rta;
  public bws rtc;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rta == null) {
        throw new b("Not all required fields were included: VoiceAttr");
      }
      if (this.rtc == null) {
        throw new b("Not all required fields were included: UploadCtx");
      }
      if (this.rtW == null) {
        throw new b("Not all required fields were included: Data");
      }
      if (this.shX != null)
      {
        paramVarArgs.fV(1, this.shX.boi());
        this.shX.a(paramVarArgs);
      }
      if (this.rsZ != null) {
        paramVarArgs.g(2, this.rsZ);
      }
      if (this.rta != null)
      {
        paramVarArgs.fV(3, this.rta.boi());
        this.rta.a(paramVarArgs);
      }
      if (this.rtc != null)
      {
        paramVarArgs.fV(4, this.rtc.boi());
        this.rtc.a(paramVarArgs);
      }
      if (this.rtW != null)
      {
        paramVarArgs.fV(5, this.rtW.boi());
        this.rtW.a(paramVarArgs);
      }
      paramVarArgs.fT(6, this.otY);
      if (this.jTv != null) {
        paramVarArgs.g(7, this.jTv);
      }
      if (this.jTu != null) {
        paramVarArgs.g(8, this.jTu);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label1024;
      }
    }
    label1024:
    for (int i = f.a.a.a.fS(1, this.shX.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.rsZ != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.rsZ);
      }
      i = paramInt;
      if (this.rta != null) {
        i = paramInt + f.a.a.a.fS(3, this.rta.boi());
      }
      paramInt = i;
      if (this.rtc != null) {
        paramInt = i + f.a.a.a.fS(4, this.rtc.boi());
      }
      i = paramInt;
      if (this.rtW != null) {
        i = paramInt + f.a.a.a.fS(5, this.rtW.boi());
      }
      i += f.a.a.a.fQ(6, this.otY);
      paramInt = i;
      if (this.jTv != null) {
        paramInt = i + f.a.a.b.b.a.h(7, this.jTv);
      }
      i = paramInt;
      if (this.jTu != null) {
        i = paramInt + f.a.a.b.b.a.h(8, this.jTu);
      }
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = bhd.a(paramVarArgs); paramInt > 0; paramInt = bhd.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.rta == null) {
          throw new b("Not all required fields were included: VoiceAttr");
        }
        if (this.rtc == null) {
          throw new b("Not all required fields were included: UploadCtx");
        }
        if (this.rtW != null) {
          break;
        }
        throw new b("Not all required fields were included: Data");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        bwt localbwt = (bwt)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new fk();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((fk)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localbwt.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localbwt.rsZ = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new byo();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((byo)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localbwt.rta = ((byo)localObject1);
            paramInt += 1;
          }
        case 4: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bws();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bws)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localbwt.rtc = ((bws)localObject1);
            paramInt += 1;
          }
        case 5: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhy();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localbwt.rtW = ((bhy)localObject1);
            paramInt += 1;
          }
        case 6: 
          localbwt.otY = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 7: 
          localbwt.jTv = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localbwt.jTu = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/protocal/c/bwt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */