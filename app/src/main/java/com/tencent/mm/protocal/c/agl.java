package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class agl
  extends bhp
{
  public String jOS;
  public String jPe;
  public LinkedList<ts> rHC = new LinkedList();
  public String rJT;
  public bhy rcT;
  public LinkedList<ta> rgD = new LinkedList();
  public String rgK;
  public String rxm;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.six == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.rJT == null) {
        throw new b("Not all required fields were included: BannerUrl");
      }
      if (this.jPe == null) {
        throw new b("Not all required fields were included: Name");
      }
      if (this.jOS == null) {
        throw new b("Not all required fields were included: Desc");
      }
      if (this.rxm == null) {
        throw new b("Not all required fields were included: HeadUrl");
      }
      if (this.rgK == null) {
        throw new b("Not all required fields were included: BizName");
      }
      if (this.rcT == null) {
        throw new b("Not all required fields were included: ReqBuf");
      }
      if (this.six != null)
      {
        paramVarArgs.fV(1, this.six.boi());
        this.six.a(paramVarArgs);
      }
      if (this.rJT != null) {
        paramVarArgs.g(2, this.rJT);
      }
      if (this.jPe != null) {
        paramVarArgs.g(3, this.jPe);
      }
      if (this.jOS != null) {
        paramVarArgs.g(4, this.jOS);
      }
      if (this.rxm != null) {
        paramVarArgs.g(5, this.rxm);
      }
      if (this.rgK != null) {
        paramVarArgs.g(6, this.rgK);
      }
      paramVarArgs.d(7, 8, this.rHC);
      if (this.rcT != null)
      {
        paramVarArgs.fV(8, this.rcT.boi());
        this.rcT.a(paramVarArgs);
      }
      paramVarArgs.d(9, 8, this.rgD);
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label1203;
      }
    }
    label1203:
    for (int i = f.a.a.a.fS(1, this.six.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.rJT != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.rJT);
      }
      i = paramInt;
      if (this.jPe != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.jPe);
      }
      paramInt = i;
      if (this.jOS != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.jOS);
      }
      i = paramInt;
      if (this.rxm != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.rxm);
      }
      paramInt = i;
      if (this.rgK != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.rgK);
      }
      i = paramInt + f.a.a.a.c(7, 8, this.rHC);
      paramInt = i;
      if (this.rcT != null) {
        paramInt = i + f.a.a.a.fS(8, this.rcT.boi());
      }
      return paramInt + f.a.a.a.c(9, 8, this.rgD);
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.rHC.clear();
        this.rgD.clear();
        paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
        for (paramInt = bhp.a(paramVarArgs); paramInt > 0; paramInt = bhp.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.six == null) {
          throw new b("Not all required fields were included: BaseResponse");
        }
        if (this.rJT == null) {
          throw new b("Not all required fields were included: BannerUrl");
        }
        if (this.jPe == null) {
          throw new b("Not all required fields were included: Name");
        }
        if (this.jOS == null) {
          throw new b("Not all required fields were included: Desc");
        }
        if (this.rxm == null) {
          throw new b("Not all required fields were included: HeadUrl");
        }
        if (this.rgK == null) {
          throw new b("Not all required fields were included: BizName");
        }
        if (this.rcT != null) {
          break;
        }
        throw new b("Not all required fields were included: ReqBuf");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        agl localagl = (agl)paramVarArgs[1];
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
            localagl.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          localagl.rJT = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localagl.jPe = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localagl.jOS = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localagl.rxm = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          localagl.rgK = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 7: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new ts();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((ts)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localagl.rHC.add(localObject1);
            paramInt += 1;
          }
        case 8: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhy();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localagl.rcT = ((bhy)localObject1);
            paramInt += 1;
          }
        }
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new ta();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((ta)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
          localagl.rgD.add(localObject1);
          paramInt += 1;
        }
        break;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/agl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */