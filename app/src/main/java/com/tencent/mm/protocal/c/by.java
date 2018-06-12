package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class by
  extends com.tencent.mm.bk.a
{
  public int hcd;
  public int jQd;
  public int lOH;
  public int rci;
  public bhz rcj;
  public bhz rck;
  public bhz rcl;
  public int rcm;
  public bhy rcn;
  public String rco;
  public String rcp;
  public long rcq;
  public int rcr;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rcj == null) {
        throw new b("Not all required fields were included: FromUserName");
      }
      if (this.rck == null) {
        throw new b("Not all required fields were included: ToUserName");
      }
      if (this.rcl == null) {
        throw new b("Not all required fields were included: Content");
      }
      if (this.rcn == null) {
        throw new b("Not all required fields were included: ImgBuf");
      }
      paramVarArgs.fT(1, this.rci);
      if (this.rcj != null)
      {
        paramVarArgs.fV(2, this.rcj.boi());
        this.rcj.a(paramVarArgs);
      }
      if (this.rck != null)
      {
        paramVarArgs.fV(3, this.rck.boi());
        this.rck.a(paramVarArgs);
      }
      paramVarArgs.fT(4, this.jQd);
      if (this.rcl != null)
      {
        paramVarArgs.fV(5, this.rcl.boi());
        this.rcl.a(paramVarArgs);
      }
      paramVarArgs.fT(6, this.hcd);
      paramVarArgs.fT(7, this.rcm);
      if (this.rcn != null)
      {
        paramVarArgs.fV(8, this.rcn.boi());
        this.rcn.a(paramVarArgs);
      }
      paramVarArgs.fT(9, this.lOH);
      if (this.rco != null) {
        paramVarArgs.g(10, this.rco);
      }
      if (this.rcp != null) {
        paramVarArgs.g(11, this.rcp);
      }
      paramVarArgs.T(12, this.rcq);
      paramVarArgs.fT(13, this.rcr);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = f.a.a.a.fQ(1, this.rci) + 0;
      paramInt = i;
      if (this.rcj != null) {
        paramInt = i + f.a.a.a.fS(2, this.rcj.boi());
      }
      i = paramInt;
      if (this.rck != null) {
        i = paramInt + f.a.a.a.fS(3, this.rck.boi());
      }
      i += f.a.a.a.fQ(4, this.jQd);
      paramInt = i;
      if (this.rcl != null) {
        paramInt = i + f.a.a.a.fS(5, this.rcl.boi());
      }
      i = paramInt + f.a.a.a.fQ(6, this.hcd) + f.a.a.a.fQ(7, this.rcm);
      paramInt = i;
      if (this.rcn != null) {
        paramInt = i + f.a.a.a.fS(8, this.rcn.boi());
      }
      i = paramInt + f.a.a.a.fQ(9, this.lOH);
      paramInt = i;
      if (this.rco != null) {
        paramInt = i + f.a.a.b.b.a.h(10, this.rco);
      }
      i = paramInt;
      if (this.rcp != null) {
        i = paramInt + f.a.a.b.b.a.h(11, this.rcp);
      }
      return i + f.a.a.a.S(12, this.rcq) + f.a.a.a.fQ(13, this.rcr);
    }
    if (paramInt == 2)
    {
      paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cJS();
        }
      }
      if (this.rcj == null) {
        throw new b("Not all required fields were included: FromUserName");
      }
      if (this.rck == null) {
        throw new b("Not all required fields were included: ToUserName");
      }
      if (this.rcl == null) {
        throw new b("Not all required fields were included: Content");
      }
      if (this.rcn == null) {
        throw new b("Not all required fields were included: ImgBuf");
      }
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
      by localby = (by)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        return -1;
      case 1: 
        localby.rci = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 2: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bhz();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bhz)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localby.rcj = ((bhz)localObject1);
          paramInt += 1;
        }
        return 0;
      case 3: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bhz();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bhz)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localby.rck = ((bhz)localObject1);
          paramInt += 1;
        }
        return 0;
      case 4: 
        localby.jQd = ((f.a.a.a.a)localObject1).vHC.rY();
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
          for (bool = true; bool; bool = ((bhz)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localby.rcl = ((bhz)localObject1);
          paramInt += 1;
        }
        return 0;
      case 6: 
        localby.hcd = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 7: 
        localby.rcm = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 8: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bhy();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localby.rcn = ((bhy)localObject1);
          paramInt += 1;
        }
        return 0;
      case 9: 
        localby.lOH = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 10: 
        localby.rco = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 11: 
        localby.rcp = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 12: 
        localby.rcq = ((f.a.a.a.a)localObject1).vHC.rZ();
        return 0;
      }
      localby.rcr = ((f.a.a.a.a)localObject1).vHC.rY();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/protocal/c/by.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */