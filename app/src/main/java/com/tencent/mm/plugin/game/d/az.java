package com.tencent.mm.plugin.game.d;

import com.tencent.mm.protocal.c.bhp;
import com.tencent.mm.protocal.c.fl;
import f.a.a.b;
import java.util.LinkedList;

public final class az
  extends bhp
{
  public e jOV;
  public br jRA;
  public ct jRB;
  public LinkedList<u> jRC = new LinkedList();
  public cy jRD;
  public bt jRE;
  public bq jRF;
  public String jRw;
  public LinkedList<t> jRx = new LinkedList();
  public ce jRy;
  public bu jRz;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.six == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.jOV == null) {
        throw new b("Not all required fields were included: AppItem");
      }
      if (this.jRw == null) {
        throw new b("Not all required fields were included: BackGroundURL");
      }
      if (this.six != null)
      {
        paramVarArgs.fV(1, this.six.boi());
        this.six.a(paramVarArgs);
      }
      if (this.jOV != null)
      {
        paramVarArgs.fV(2, this.jOV.boi());
        this.jOV.a(paramVarArgs);
      }
      if (this.jRw != null) {
        paramVarArgs.g(3, this.jRw);
      }
      paramVarArgs.d(4, 8, this.jRx);
      if (this.jRy != null)
      {
        paramVarArgs.fV(5, this.jRy.boi());
        this.jRy.a(paramVarArgs);
      }
      if (this.jRz != null)
      {
        paramVarArgs.fV(7, this.jRz.boi());
        this.jRz.a(paramVarArgs);
      }
      if (this.jRA != null)
      {
        paramVarArgs.fV(8, this.jRA.boi());
        this.jRA.a(paramVarArgs);
      }
      if (this.jRB != null)
      {
        paramVarArgs.fV(9, this.jRB.boi());
        this.jRB.a(paramVarArgs);
      }
      paramVarArgs.d(10, 8, this.jRC);
      if (this.jRD != null)
      {
        paramVarArgs.fV(11, this.jRD.boi());
        this.jRD.a(paramVarArgs);
      }
      if (this.jRE != null)
      {
        paramVarArgs.fV(12, this.jRE.boi());
        this.jRE.a(paramVarArgs);
      }
      if (this.jRF != null)
      {
        paramVarArgs.fV(13, this.jRF.boi());
        this.jRF.a(paramVarArgs);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label1890;
      }
    }
    label1890:
    for (int i = f.a.a.a.fS(1, this.six.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.jOV != null) {
        paramInt = i + f.a.a.a.fS(2, this.jOV.boi());
      }
      i = paramInt;
      if (this.jRw != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.jRw);
      }
      i += f.a.a.a.c(4, 8, this.jRx);
      paramInt = i;
      if (this.jRy != null) {
        paramInt = i + f.a.a.a.fS(5, this.jRy.boi());
      }
      i = paramInt;
      if (this.jRz != null) {
        i = paramInt + f.a.a.a.fS(7, this.jRz.boi());
      }
      paramInt = i;
      if (this.jRA != null) {
        paramInt = i + f.a.a.a.fS(8, this.jRA.boi());
      }
      i = paramInt;
      if (this.jRB != null) {
        i = paramInt + f.a.a.a.fS(9, this.jRB.boi());
      }
      i += f.a.a.a.c(10, 8, this.jRC);
      paramInt = i;
      if (this.jRD != null) {
        paramInt = i + f.a.a.a.fS(11, this.jRD.boi());
      }
      i = paramInt;
      if (this.jRE != null) {
        i = paramInt + f.a.a.a.fS(12, this.jRE.boi());
      }
      paramInt = i;
      if (this.jRF != null) {
        paramInt = i + f.a.a.a.fS(13, this.jRF.boi());
      }
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.jRx.clear();
        this.jRC.clear();
        paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
        for (paramInt = bhp.a(paramVarArgs); paramInt > 0; paramInt = bhp.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.six == null) {
          throw new b("Not all required fields were included: BaseResponse");
        }
        if (this.jOV == null) {
          throw new b("Not all required fields were included: AppItem");
        }
        if (this.jRw != null) {
          break;
        }
        throw new b("Not all required fields were included: BackGroundURL");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        az localaz = (az)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        case 6: 
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
            localaz.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new e();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((e)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localaz.jOV = ((e)localObject1);
            paramInt += 1;
          }
        case 3: 
          localaz.jRw = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new t();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((t)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localaz.jRx.add(localObject1);
            paramInt += 1;
          }
        case 5: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new ce();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((ce)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localaz.jRy = ((ce)localObject1);
            paramInt += 1;
          }
        case 7: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bu();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bu)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localaz.jRz = ((bu)localObject1);
            paramInt += 1;
          }
        case 8: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new br();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((br)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localaz.jRA = ((br)localObject1);
            paramInt += 1;
          }
        case 9: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new ct();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((ct)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localaz.jRB = ((ct)localObject1);
            paramInt += 1;
          }
        case 10: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new u();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((u)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localaz.jRC.add(localObject1);
            paramInt += 1;
          }
        case 11: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new cy();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localaz.jRD = ((cy)localObject1);
            paramInt += 1;
          }
        case 12: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bt();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bt)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localaz.jRE = ((bt)localObject1);
            paramInt += 1;
          }
        }
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bq();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bq)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
          localaz.jRF = ((bq)localObject1);
          paramInt += 1;
        }
        break;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/game/d/az.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */