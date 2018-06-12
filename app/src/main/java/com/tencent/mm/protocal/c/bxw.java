package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class bxw
  extends bhp
{
  public bhz rMn;
  public bhy rcn;
  public String reA;
  public bhy reB;
  public bhy rev;
  public bhz rhY;
  public bhy rhZ;
  public String rwj;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.six == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.rMn == null) {
        throw new b("Not all required fields were included: ImgSid");
      }
      if (this.rcn == null) {
        throw new b("Not all required fields were included: ImgBuf");
      }
      if (this.six != null)
      {
        paramVarArgs.fV(1, this.six.boi());
        this.six.a(paramVarArgs);
      }
      if (this.rMn != null)
      {
        paramVarArgs.fV(2, this.rMn.boi());
        this.rMn.a(paramVarArgs);
      }
      if (this.rcn != null)
      {
        paramVarArgs.fV(3, this.rcn.boi());
        this.rcn.a(paramVarArgs);
      }
      if (this.rwj != null) {
        paramVarArgs.g(4, this.rwj);
      }
      if (this.rhY != null)
      {
        paramVarArgs.fV(5, this.rhY.boi());
        this.rhY.a(paramVarArgs);
      }
      if (this.reB != null)
      {
        paramVarArgs.fV(6, this.reB.boi());
        this.reB.a(paramVarArgs);
      }
      if (this.rhZ != null)
      {
        paramVarArgs.fV(7, this.rhZ.boi());
        this.rhZ.a(paramVarArgs);
      }
      if (this.reA != null) {
        paramVarArgs.g(8, this.reA);
      }
      if (this.rev != null)
      {
        paramVarArgs.fV(9, this.rev.boi());
        this.rev.a(paramVarArgs);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label1373;
      }
    }
    label1373:
    for (int i = f.a.a.a.fS(1, this.six.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.rMn != null) {
        paramInt = i + f.a.a.a.fS(2, this.rMn.boi());
      }
      i = paramInt;
      if (this.rcn != null) {
        i = paramInt + f.a.a.a.fS(3, this.rcn.boi());
      }
      paramInt = i;
      if (this.rwj != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.rwj);
      }
      i = paramInt;
      if (this.rhY != null) {
        i = paramInt + f.a.a.a.fS(5, this.rhY.boi());
      }
      paramInt = i;
      if (this.reB != null) {
        paramInt = i + f.a.a.a.fS(6, this.reB.boi());
      }
      i = paramInt;
      if (this.rhZ != null) {
        i = paramInt + f.a.a.a.fS(7, this.rhZ.boi());
      }
      paramInt = i;
      if (this.reA != null) {
        paramInt = i + f.a.a.b.b.a.h(8, this.reA);
      }
      i = paramInt;
      if (this.rev != null) {
        i = paramInt + f.a.a.a.fS(9, this.rev.boi());
      }
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = bhp.a(paramVarArgs); paramInt > 0; paramInt = bhp.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.six == null) {
          throw new b("Not all required fields were included: BaseResponse");
        }
        if (this.rMn == null) {
          throw new b("Not all required fields were included: ImgSid");
        }
        if (this.rcn != null) {
          break;
        }
        throw new b("Not all required fields were included: ImgBuf");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        bxw localbxw = (bxw)paramVarArgs[1];
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
            localObject1 = new fl();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((fl)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localbxw.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhz();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhz)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localbxw.rMn = ((bhz)localObject1);
            paramInt += 1;
          }
        case 3: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhy();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localbxw.rcn = ((bhy)localObject1);
            paramInt += 1;
          }
        case 4: 
          localbxw.rwj = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhz();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhz)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localbxw.rhY = ((bhz)localObject1);
            paramInt += 1;
          }
        case 6: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhy();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localbxw.reB = ((bhy)localObject1);
            paramInt += 1;
          }
        case 7: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhy();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localbxw.rhZ = ((bhy)localObject1);
            paramInt += 1;
          }
        case 8: 
          localbxw.reA = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bhy();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
          localbxw.rev = ((bhy)localObject1);
          paramInt += 1;
        }
        break;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bxw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */